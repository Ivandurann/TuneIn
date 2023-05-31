package com.example.aut2_03aplicacinfinalandroid.ui.shareCode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.aut2_03aplicacinfinalandroid.R;

public class ShareFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ShareFragmentViewModel homeViewModel =
                new ViewModelProvider(this).get(ShareFragmentViewModel.class);

        View view = inflater.inflate(R.layout.frag_view_share, container, false);

        return view;
    }
}