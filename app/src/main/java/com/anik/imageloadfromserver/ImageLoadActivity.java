package com.anik.imageloadfromserver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageLoadActivity extends AppCompatActivity {

    ImageView imgLoad;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_load);

        imgLoad=findViewById(R.id.img_load);

        String getURL=getIntent().getExtras().getString("url");

        Glide.with(this)
                .load(getURL)
                .placeholder(R.drawable.loading)
                .error(R.drawable.not_found)
                .into(imgLoad);


    }
}
