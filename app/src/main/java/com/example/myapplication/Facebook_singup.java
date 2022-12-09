package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Facebook_singup extends AppCompatActivity {
    //AutoCompleteTextView and progressDialog example
    AutoCompleteTextView email;
    //Intalize edittext
    List<String> list;                //add string ist
    ProgressDialog progressDialog;    //Intalize progressDialog
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("TAG", "onCreate: ");     //showing output view in logcat
        setContentView(R.layout.activity_facebook_singup);
        list = new ArrayList<>();
        list.add("Pankaj");
        list.add("Rakhi");
        list.add("Manoj");
        list.add("Ajinkya");
        list.add("Manish");
        list.add("Tejas");
        list.add("abhishekh");

        try {
            getResources().getAssets().open("ARIA.TTF");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //  List<String> list1 = new ArrayList<>();
     //   list1.addAll(list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Facebook_singup.this, android.R.layout.simple_list_item_1, list);
        email = findViewById(R.id.email);
        email.setAdapter(adapter);


       //using progressdialog
        progressDialog = new ProgressDialog(Facebook_singup.this);
        progressDialog.setMessage("please wait.....");
        progressDialog.show();
    }


}