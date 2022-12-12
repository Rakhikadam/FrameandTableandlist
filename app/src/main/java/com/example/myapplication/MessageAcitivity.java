package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import messagelist.msg;

public class MessageAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_acitivity);
        ListView listView = findViewById(R.id.msglist);
        List<msg>msgList = new ArrayList<>();
        msg user = new msg("hiiiii","Rakhi","8268322","rakhik1@gmail.com");
        msgList.add(user);
        MessageAdpter messageAdpter = new MessageAdpter(msgList);
        listView.setAdapter(messageAdpter);


    }
    class MessageAdpter extends BaseAdapter{List<msg>list1;

        public MessageAdpter(List<msg> msgList) {
            this.list1 = msgList;

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
            View ABC = LayoutInflater.from(MessageAcitivity.this).inflate(R.layout.msglist,viewGroup,false);
            TextView textView = ABC.findViewById(R.id.namemsg);
            textView.setText(list1.get(i).getName());
            TextView textView1 = ABC.findViewById(R.id.nmbermsg);
            textView1.setText(list1.get(i).getNumber());
            //setclick listener on msg button in call list page
            ImageView imageView = ABC.findViewById(R.id.msg);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setData(Uri.parse("sms:"+list1.get(i).getNumber()));
                    startActivity(smsIntent);
                }
            });

            //setclick listener on email text in call list page
            TextView mail = ABC.findViewById(R.id.gmail);
            mail.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mailIntent = new Intent(Intent.ACTION_VIEW);
                    mailIntent.setData(Uri.parse("mailto:"+list1.get(i).getMail()));
                    startActivity(mailIntent);
                }
            });

            //set longclick listener on msg set dialog activity

            imageView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Dialog dialog= new Dialog(MessageAcitivity.this);
                    dialog.setContentView(R.layout.dialog);
                    EditText input =dialog.findViewById(R.id.et_input);
                    Button send =dialog.findViewById(R.id.send);
                    send.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                            smsIntent.setData(Uri.parse("sms:"+list1.get(i).getNumber()));
                            smsIntent.putExtra("sms_body",input.getText().toString());
                            startActivity(smsIntent);
                        }
                    });
                    dialog.show();
                    return false;
                }
            });

            return ABC;
        }
    }
}