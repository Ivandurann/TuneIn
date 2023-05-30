package com.example.aut2_03aplicacinfinalandroid.ui.settingsCode;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SettingsFragmentView extends ViewModel {

    private final MutableLiveData<String> mText;

    public SettingsFragmentView() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es la cuarta");
    }

    public LiveData<String> getText() {
        return mText;
    }
}