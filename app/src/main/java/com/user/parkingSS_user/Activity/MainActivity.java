package com.user.parkingSS_user.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.parkingSS_user.R;
import com.user.parkingSS_user.Utility.BottomNavHelper;

public class MainActivity extends AppCompatActivity {

    RelativeLayout rel2,rel3;
    Context context = MainActivity.this;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
rel2 = findViewById(R.id.rel2);
rel3 = findViewById(R.id.rel3);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);

rel2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, Req_Driver.class);
        startActivity(intent);
    }
});

        rel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Req_Driver.class);
                startActivity(intent);
            }
        });


    }
}
