package com.example.aut2_03aplicacinfinalandroid.ui.listCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ListFragmentViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ListFragmentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Lists");
    }

    public LiveData<String> getText() {
        return mText;
    }
}