package com.example.aut2_03aplicacinfinalandroid.ui.homeCode;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aut2_03aplicacinfinalandroid.MusicLogic.AudioModel;
import com.example.aut2_03aplicacinfinalandroid.MusicLogic.MusicListAdapter;
import com.example.aut2_03aplicacinfinalandroid.R;

import java.io.File;
import java.util.ArrayList;

public class HomeFragment extends Fragment {

    View view;

    RecyclerView recyclerView;
    TextView noMusicTextView;
    ArrayList<AudioModel> songsList = new ArrayList<>();

    Context context;
    Activity activity;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeFragmentViewModel galleryViewModel =
                new ViewModelProvider(this).get(HomeFragmentViewModel.class);

        View view = inflater.inflate(R.layout.frag_view_home, container, false);

        noMusicTextView = view.findViewById(R.id.no_songs_text);
        recyclerView = view.findViewById(R.id.recycler_view);

        context = getContext();
        activity = getActivity();


        if(checkPermission() == false) {
            System.out.println("Rula?");
            requestPermission();
        } else {
            System.out.println("Rula!");
            loadMusicList();
        }

        this.view = view;
        return view;
    }

    boolean checkPermission(){

        System.out.println("Comprobado permisos");

        int result = ContextCompat.checkSelfPermission(getContext(), Manifest.permission.READ_EXTERNAL_STORAGE);
        if(result == PackageManager.PERMISSION_GRANTED){
            return true;
        }else{
            return false;
        }
    }

    void requestPermission() {

        System.out.println("Pidiedo permisos");

        if (ActivityCompat.shouldShowRequestPermissionRationale(activity,
                Manifest.permission.READ_EXTERNAL_STORAGE)) {
            Toast.makeText(context, "Permisos necesarios, activelos en configuracion", Toast.LENGTH_SHORT).show();
        } else {
            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 123);
        }
    }

    private void loadMusicList() {

        songsList.clear();

        String[] projection = {
                MediaStore.Audio.Media.TITLE,
                MediaStore.Audio.Media.DATA,
                MediaStore.Audio.Media.DURATION
        };

        String selection = MediaStore.Audio.Media.IS_MUSIC + " != 0";

        Cursor cursor = requireContext().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                projection, selection, null, null);

        while (cursor.moveToNext()) {
            AudioModel songData = new AudioModel(cursor.getString(1),
                    cursor.getString(0), cursor.getString(2));
            if (new File(songData.getPath()).exists()) {
                songsList.add(songData);
            }
        }

        if (songsList.size() == 0) {
            noMusicTextView.setVisibility(View.VISIBLE);
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
            recyclerView.setAdapter(new MusicListAdapter(songsList, context.getApplicationContext()));
        }
    }

}