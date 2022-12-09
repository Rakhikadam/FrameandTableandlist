
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CallActivity extends AppCompatActivity {
Button callbtn;
TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Phonecall example shortly

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        number = findViewById(R.id.number);
        callbtn = findViewById(R.id.callbtn);


        callbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                String strnumber  = number.getText().toString();
                intent.setData(Uri.parse("tel:"+strnumber));
                startActivity(intent);
            }
        });
    }
}