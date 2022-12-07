package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class profie extends AppCompatActivity {
    //GridView example

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profie);
        GridView imageView = findViewById(R.id.gridimg);
        List<image>list = new ArrayList<>();
        //List<Drawable> list1= new ArrayList<>();
        //Drawable drawable1= getResources().getDrawable(R.drawable.test);
       // list1.add(drawable1);
        image user = new image("https://images.unsplash.com/photo-1611068813580-b07ef920964b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80");
        list.add(user);
        GridAdpter gridAdpter = new GridAdpter(list);
        imageView.setAdapter(gridAdpter);
    }
    public class GridAdpter extends BaseAdapter{
        List<image>imageList;

        public GridAdpter(List<image> imageList) {
            this.imageList = imageList;
        }

        @Override
        public int getCount() {
            return imageList.size();
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
            View view2 = LayoutInflater.from(profie.this).inflate(R.layout.gridlist,viewGroup,false);
            ImageView imageView = view2.findViewById(R.id.image1);
            Glide.with(profie.this).load(imageList.get(i).getImage()).into(imageView);
            return view2;
        }
    }
        }

