package com.jalen.imageforiphone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageForScroll sc = (ImageForScroll) findViewById(R.id.sc);
        img = (ImageView) findViewById(R.id.img);
        sc.setChangeView(img);
    }
}
