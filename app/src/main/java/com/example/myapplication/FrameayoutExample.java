package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.FrameLayout;

public class FrameayoutExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frameayout_example);
        FragmentTransaction transaction  = getFragmentManager().beginTransaction();
        transaction.replace(R.id.frame, new View1());
transaction.commit();


    }
}