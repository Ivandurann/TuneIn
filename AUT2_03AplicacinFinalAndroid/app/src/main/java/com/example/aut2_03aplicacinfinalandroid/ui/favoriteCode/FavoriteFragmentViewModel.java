package com.example.aut2_03aplicacinfinalandroid.ui.favoriteCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavoriteFragmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FavoriteFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Favorite");
    }

    public LiveData<String> getText() {
        return mText;
    }

}