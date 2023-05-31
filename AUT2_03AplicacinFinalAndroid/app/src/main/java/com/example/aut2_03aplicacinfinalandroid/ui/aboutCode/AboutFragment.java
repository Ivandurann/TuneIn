package com.example.aut2_03aplicacinfinalandroid.ui.aboutCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aut2_03aplicacinfinalandroid.R;

public class AboutFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AboutFragmentViewModel homeViewModel =
                new ViewModelProvider(this).get(AboutFragmentViewModel.class);

        View view = inflater.inflate(R.layout.frag_view_about, container, false);

        return view;
    }
}