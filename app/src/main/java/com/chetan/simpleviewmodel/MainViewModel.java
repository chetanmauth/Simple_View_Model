package com.chetan.simpleviewmodel;

import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    int score=0;

    public MainViewModel() {
        System.out.println("view model created");
    }

    public void increment(){
        score++;
    }

    public void decrement(){
        score--;
    }
}
