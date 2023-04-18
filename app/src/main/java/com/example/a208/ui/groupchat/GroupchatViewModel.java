package com.example.a208.ui.groupchat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GroupchatViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public GroupchatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is groupchat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}