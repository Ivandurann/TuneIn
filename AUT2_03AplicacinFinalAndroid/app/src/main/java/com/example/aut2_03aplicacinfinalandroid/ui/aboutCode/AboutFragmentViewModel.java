package com.example.aut2_03aplicacinfinalandroid.ui.aboutCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutFragmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AboutFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Favorite");
    }

    public LiveData<String> getText() {
        return mText;
    }

}