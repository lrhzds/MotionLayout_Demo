package com.example.forblog;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class AutoTouch {

    public void autoClickPos(final double x1, final double y1, final double x2, final double y2) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("=========");
                String[] order = {"input", "swipe", "" + x1, "" + y1, "" + x2, "" + y2,};
                try {
                    new ProcessBuilder(order).start();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
