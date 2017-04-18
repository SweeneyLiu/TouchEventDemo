package com.lsw.demo.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.lsw.demo.R;

public class MainActivity extends AppCompatActivity {

    private LinearLayout myLayout;
    private Button button1;
    private Button button2;
    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myLayout = (LinearLayout)findViewById(R.id.my_layout);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        mImageView = (ImageView)findViewById(R.id.image_view);

        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("lsw---", "myLayout on touch");
                return false;
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("lsw---", "You clicked button1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("lsw---", "You clicked button2");
            }
        });

        mImageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("lsw---", "ImageView onTouch execute, action " + event.getAction());
                return false;
            }
        });

        button1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.d("lsw---", "Button onTouch execute, action " + event.getAction());
                return false;
            }
        });
    }
}
