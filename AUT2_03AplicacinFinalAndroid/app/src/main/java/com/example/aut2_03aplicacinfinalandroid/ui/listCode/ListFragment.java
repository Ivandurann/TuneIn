package com.example.aut2_03aplicacinfinalandroid.ui.listCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aut2_03aplicacinfinalandroid.R;

public class ListFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ListFragmentViewModel slideshowViewModel =
                new ViewModelProvider(this).get(ListFragmentViewModel.class);

        /* binding = FragViewActividad3Binding.inflate(inflater, container, false);
        View root = binding.getRoot();*/

        View view = inflater.inflate(R.layout.frag_view_lists, container, false);

            return view;
        }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}