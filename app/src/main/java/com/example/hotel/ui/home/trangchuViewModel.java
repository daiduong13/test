package com.example.hotel.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class trangchuViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public trangchuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("fragment trang chủ");
    }

    public LiveData<String> getText() {
        return mText;
    }
}