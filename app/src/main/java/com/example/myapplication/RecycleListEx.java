package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class RecycleListEx extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_list_ex);
        RecyclerView contact =findViewById(R.id.conatctlist);
        List<contactlist>list = new ArrayList<>();
        list.add(new contactlist("rakhi","865542","rakhi1@gmail.com"));
        list.add(new contactlist("rani","9933332","rani1@gmail.com"));


    }

    //first implements method. second create class of contactAdpter then extends RecyclerView.ViewHolder
    //after method override

    class ContactAdpter extends RecyclerView.Adapter<ContactAdpter.MyCustomViewAdpter>{

        @NonNull
        @Override
        public ContactAdpter.MyCustomViewAdpter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return null;
        }

        @Override
        public void onBindViewHolder(@NonNull ContactAdpter.MyCustomViewAdpter holder, int position) {

        }

        @Override
        public int getItemCount() {
            return 0;
        }

        public class MyCustomViewAdpter extends RecyclerView.ViewHolder {
            public MyCustomViewAdpter(@NonNull View itemView) {
                super(itemView);
            }
        }
    }
}