package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import calling_List.callList;

public class PhonecallActivity extends AppCompatActivity {
    //PhonecallActivity is not running proprly.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonecall);
        ListView listView = findViewById(R.id.listcall);
        ImageView imageView = findViewById(R.id.imagec);
        ImageView imagecall = findViewById(R.id.imagecall);
        TextView textView = findViewById(R.id.textc);
        TextView textView1 = findViewById(R.id.nmbercall);
        List<callList>list = new ArrayList<>();
        callList user1 = new callList("https://images.unsplash.com/photo-1611068813580-b07ef920964b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80","AAAAAAAAA",888);
        list.add(user1);
        PhoneAdpter adpter = new PhoneAdpter(list);
        listView.setAdapter(adpter);


        imagecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(Intent.ACTION_CALL);
                String number = textView1.getText().toString();
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });


    }
    class PhoneAdpter extends BaseAdapter{
        List<callList>list1;
        public PhoneAdpter(List<callList> list) {
            this.list1=list;

        }

        @Override
        public int getCount() {
            return list1.size();
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View ABC = LayoutInflater.from(PhonecallActivity.this).inflate(R.layout.phone_call_list,viewGroup,false);
            ImageView imageView = ABC.findViewById(R.id.imagec);
            Glide.with(PhonecallActivity.this).load(list1.get(i).getProfile()).into(imageView);
            TextView textView = ABC.findViewById(R.id.textc);
            textView.setText(list1.get(i).getName());
            TextView textView1 = ABC.findViewById(R.id.nmbercall);
            textView1.setText(list1.get(i).getNumber());
            return ABC;
        }
    }
}