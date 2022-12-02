package com.example.forblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        AutoTouch autoTouch = new AutoTouch();
        autoTouch.autoClickPos(300,300,300,300);

        Thread t= new Thread(new Runnable() {

            @Override
            public void run() {
                //1:休眠6S
                try {
                    Thread.sleep(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //进入主页面
                Intent it=new Intent(StartActivity.this,
                        MainActivity.class);
                startActivity(it);
            }
        });
        //2:启动这个子线程
        t.start();
    }
}