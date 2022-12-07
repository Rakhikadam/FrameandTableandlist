package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import table.tableist;

public class tablepractice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablepractice);
        TableLayout table = findViewById(R.id.table1);
        List<tableist>list = new ArrayList<>();
        list.add(new tableist("2","AAAA","black"));
        list.add(new tableist("3","BBBB","white"));
        list.add(new tableist("4","CCCC","blue"));
        list.add(new tableist("5","DDDD","green"));
        list.add(new tableist("6","EEEE","greay"));
        table.removeAllViews();

        for (tableist user : list ){
            TableRow tableRow = new TableRow(tablepractice.this);
            TextView rollno = new TextView(tablepractice.this);
            rollno.setText(user.getRollno());
            TextView name = new TextView(tablepractice.this);
            name.setText(user.getName());
            TextView colour = new TextView(tablepractice.this);
            colour.setText(user.getColour());
            tableRow.addView(rollno);
            tableRow.addView(name);
            tableRow.addView(colour);
            table.addView(tableRow);


        }




    }

}