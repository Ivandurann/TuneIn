package com.example.aut2_03aplicacinfinalandroid.ui.shareCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ShareFragmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ShareFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Favorite");
    }

    public LiveData<String> getText() {
        return mText;
    }

}