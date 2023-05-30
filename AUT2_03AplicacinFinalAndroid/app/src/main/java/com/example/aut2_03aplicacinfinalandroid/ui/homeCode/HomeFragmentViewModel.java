package com.example.aut2_03aplicacinfinalandroid.ui.homeCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeFragmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Home");
    }

    public LiveData<String> getText() {
        return mText;
    }
}