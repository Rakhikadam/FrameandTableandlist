package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Table extends AppCompatActivity {
//Tabe example

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        List<User> userList = new ArrayList<>();
        userList.add(new User("pankaj", "29", "10000", "B.IT", "android"));
        userList.add(new User("prasad", "24", "10000", "B.IT", "android"));
        userList.add(new User("praju", "23", "10000", "B.IT", "android"));
        userList.add(new User("rakhi", "23", "10000", "B.IT", "android"));
        userList.add(new User("ajinkya", "25", "10000", "B.IT", "android"));
        userList.add(new User("rajesh", "22", "10000", "B.IT", "android"));
        TableLayout table = findViewById(R.id.table);
        table.removeAllViews();
        for (User user : userList) {
            TableRow row1 = new TableRow(Table.this);
            TextView name = new TextView(Table.this);
            name.setText(user.getName());
            TextView age = new TextView(Table.this);
            age.setText(user.getAge());
            TextView salary = new TextView(Table.this);
            salary.setText(user.getSalary());
            TextView qual = new TextView(Table.this);
            qual.setText(user.getQualification());
            TextView des = new TextView(Table.this);
            des.setText(user.getDesignation());

            row1.addView(name);
            row1.addView(age);
            row1.addView(salary);
            row1.addView(qual);
            row1.addView(des);
            table.addView(row1);
        }

    }
}