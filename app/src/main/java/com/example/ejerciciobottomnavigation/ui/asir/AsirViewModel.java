package com.example.ejerciciobottomnavigation.ui.asir;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AsirViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AsirViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}