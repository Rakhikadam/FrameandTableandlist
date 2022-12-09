package com.example.myapplication;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ArialTextview extends androidx.appcompat.widget.AppCompatTextView {
    public ArialTextview(Context context) {
        super(context);
    }

    public ArialTextview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Typeface  typeface  = Typeface.createFromAsset(context.getAssets(),"TimesItalic.ttf");
        this.setTypeface(typeface);
    }
}
