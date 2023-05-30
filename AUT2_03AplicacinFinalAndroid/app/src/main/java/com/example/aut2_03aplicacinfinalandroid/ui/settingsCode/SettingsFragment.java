package com.example.aut2_03aplicacinfinalandroid.ui.settingsCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aut2_03aplicacinfinalandroid.R;

public class SettingsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SettingsFragmentView galleryViewModel =
                new ViewModelProvider(this).get(SettingsFragmentView.class);

        /* binding = FragViewActividad4Binding.inflate(inflater, container, false);
        View root = binding.getRoot(); */

        View view = inflater.inflate(R.layout.frag_view_settings, container, false);

        return view;
    }

}