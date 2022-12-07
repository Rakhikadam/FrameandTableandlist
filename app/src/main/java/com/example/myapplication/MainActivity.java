package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.PatternMatcher;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    SharedPreferences.Editor editor;
    AutoCompleteTextView name;
    List<String>list;
    ProgressDialog progressDialog1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //AutoCometeTextView

        name=findViewById(R.id.name2);
        Log.e("TAG","oncreate");
        list = new ArrayList<>();
        list = new ArrayList<>();
        list.add("AAAA");
        list.add("BBBB");
        list.add("CCCC");
        list.add("DDDD");
        list.add("EEEE");
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,list);
        name.setAdapter(adapter);

//Using ProgressDialog
        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setMessage("Wait a minute");
        progressDialog.show();





//Cicklistener and edittext matching
        name = findViewById(R.id.name2);
        EditText text1 = findViewById(R.id.password);
        Button button = findViewById(R.id.button);
        button.setText("Log In");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String Email_or_name = name.getText().toString();
                if (Pattern.matches("[a-zA-Z0-9]{2,15}@[gmail]{2,4}[.com]{2,4}",Email_or_name)){
                    editor.putString("email or name",Email_or_name);
                    editor.commit();
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter the valid id or name",Toast.LENGTH_LONG).show();
                    return;

                }

                String Password = text1.getText().toString();
                if ((Pattern.matches("[[a-z]?[A-Z]?[0-9]?[!@#$%&*]?]{8,16}",Password))){
                    editor.putString("password",Password);
                    editor.commit();
                }
                else {
                    Toast.makeText(MainActivity.this,"Enter the valid password",Toast.LENGTH_LONG).show();
                    return;
                }

                Intent intent= new Intent(MainActivity.this,profie.class);
                startActivity(intent);

            }


        });

    }
}