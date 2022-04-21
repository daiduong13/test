package com.example.hotel.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class thuetraViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public thuetraViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("fragment thuê trả phòng");
    }

    public LiveData<String> getText() {
        return mText;
    }
}