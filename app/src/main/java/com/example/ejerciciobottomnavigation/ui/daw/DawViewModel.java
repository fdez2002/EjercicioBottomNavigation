package com.example.ejerciciobottomnavigation.ui.daw;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DawViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DawViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is notifications fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}