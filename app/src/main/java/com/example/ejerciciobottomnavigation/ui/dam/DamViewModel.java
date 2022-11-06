package com.example.ejerciciobottomnavigation.ui.dam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DamViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public DamViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Dam");
    }

    public LiveData<String> getText() {
        return mText;
    }
}