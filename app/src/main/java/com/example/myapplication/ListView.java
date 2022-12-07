package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListView extends AppCompatActivity {
    //Listview example

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        android.widget.ListView listView = findViewById(R.id.list1);
        List<list> userlist = new ArrayList<>();
        list user1 = new list("AAAAAAA");
        userlist.add(user1);
        list user2 = new list("BBBBBB");
        userlist.add(user2);
        list user3 = new list("CCCCCC");
        userlist.add(user3);
        list user4 = new list("DDDDD");
        userlist.add(user4);
        list user5 = new list("EEEEEE");
        userlist.add(user5);

        ListAdapter adapter = new ListAdapter(userlist);
        listView.setAdapter(adapter);
    }

        class ListAdapter extends BaseAdapter{
            List<list>list3;

            public ListAdapter(List<list> list3) {
                this.list3 = list3;
            }

            @Override
            public int getCount() {
                return list3.size();
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
                View view1 = LayoutInflater.from(ListView.this).inflate(R.layout.single_list,viewGroup,false);
                TextView textView = view1.findViewById(R.id.Tlist);
                textView.setText(list3.get(i).getName());

                return view1;
            }
        }


}