package com.chetan.simpleviewmodel;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.chetan.simpleviewmodel.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        //set init value
        setValue();

        //increment button
        mainBinding.increment.setOnClickListener(v -> {
            mainViewModel.increment();
            setValue();
        });

        //decrement button
        mainBinding.deccrement.setOnClickListener(v -> {
            mainViewModel.decrement();
            setValue();
        });

    }

    private void setValue() {
        mainBinding.textView.setText(String.valueOf(mainViewModel.score));
    }
}