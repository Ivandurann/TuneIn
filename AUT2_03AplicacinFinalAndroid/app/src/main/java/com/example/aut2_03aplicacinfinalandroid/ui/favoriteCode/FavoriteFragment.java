package com.example.aut2_03aplicacinfinalandroid.ui.favoriteCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aut2_03aplicacinfinalandroid.R;

public class FavoriteFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FavoriteFragmentViewModel homeViewModel =
                new ViewModelProvider(this).get(FavoriteFragmentViewModel.class);

        View view = inflater.inflate(R.layout.frag_view_favorite, container, false);

        return view;
    }
}