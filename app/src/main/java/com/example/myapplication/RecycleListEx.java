package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
        ContactAdpter adpter = new ContactAdpter(list);
        contact.setLayoutManager(new LinearLayoutManager(RecycleListEx.this));
        contact.setAdapter(adpter);


    }

    //first implements method. second create class of contactAdpter then extends RecyclerView.ViewHolder
    //after method override

    class ContactAdpter extends RecyclerView.Adapter<ContactAdpter.MyCustomViewAdpter>{
        List<contactlist>list1;


        public ContactAdpter(List<contactlist> list) {
            this.list1 = list;

        }

        @NonNull
        @Override
        public ContactAdpter.MyCustomViewAdpter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(RecycleListEx.this).inflate(R.layout.call_list_recycle,parent,false);
            MyCustomViewAdpter holder = new MyCustomViewAdpter(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull ContactAdpter.MyCustomViewAdpter holder, int position) {
            holder.name.setText(list1.get(position).getName());
            holder.mail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mailIntent = new Intent(Intent.ACTION_VIEW);
                    mailIntent.setData(Uri.parse("mailto:"+list1.get(position).getEmail()));
                    startActivity(mailIntent);
                }
            });

            holder.number.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:"+list1.get(position).getNumber()));
                    startActivity(callIntent);
                }
            });

            holder.sms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent msgIntent = new Intent(Intent.ACTION_VIEW);
                    msgIntent.setData(Uri.parse("sms:"+list1.get(position).getNumber()));
                    startActivity(msgIntent);
                }
            });


        }

        @Override
        public int getItemCount() {
            return list1.size();

        }

        public class MyCustomViewAdpter extends RecyclerView.ViewHolder {
            TextView name , mail;
            ImageView number , sms;


            public MyCustomViewAdpter(@NonNull View itemView) {
                super(itemView);
                name = itemView.findViewById(R.id.nameRecycle);
                mail =itemView.findViewById(R.id.mailRecycle);
                number =itemView.findViewById(R.id.callRecycle);
                sms = itemView. findViewById(R.id.msgRecycle);

            }

        }
    }
}