package com.user.parkingSS_user.Activity;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.parkingSS_user.R;
import com.user.parkingSS_user.Utility.BottomNavHelper;

public class Status extends AppCompatActivity {

    Context context = Status.this;
    private static final int ACTIVITY_NUM = 1;
    Button status;

boolean flag ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);








    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
