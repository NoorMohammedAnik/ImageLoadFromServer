package com.anik.imageloadfromserver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnImag1,btnImage2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnImag1=findViewById(R.id.btn_img1);
        btnImage2=findViewById(R.id.btn_img2);

        btnImag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ImageLoadActivity.class);
                intent.putExtra("url","https://hightech.fm/files/1/upload/1210x600/50425.jpg");
                startActivity(intent);
            }
        });



        btnImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ImageLoadActivity.class);
                intent.putExtra("url","https://cms.qz.com/wp-content/uploads/2017/04/misunderstood.jpg");
                startActivity(intent);
            }
        });
    }
}
