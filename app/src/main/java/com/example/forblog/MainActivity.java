package com.example.forblog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Carousel;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import kotlin.jvm.JvmOverloads;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int images[] = {
                R.drawable.img1,
                R.drawable.img2,
                R.drawable.img3,
                R.drawable.img4
        };

        Carousel carousel = findViewById(R.id.carousel);
        carousel.setAdapter(new Carousel.Adapter() {
            @Override
            public int count() {
                // need to return the number of items we have in the carousel
                return 4;
            }

            @Override
            public void populate(View view, int index) {
                if (view instanceof ImageView){
                    ((ImageView) view).setImageResource(images[index]);
                }

                // need to implement this to populate the view at the given index
            }

            @Override
            public void onNewItem(int index) {
                // called when an item is set
            }
        });
    }
}
