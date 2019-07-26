package com.user.parkingSS_user.Activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;


import com.user.parkingSS_user.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {

            getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                    WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }

        new Thread() {

            @Override
            public void run() {


                try {


                    Thread.sleep(6000);

                    startActivity(new Intent(Splash.this, Login_User.class));
                    //  Splash.super.finish();

                } catch (Exception e) {

                }
            }
        }.start();
    }
}
