package com.user.parkingSS_user.Utility;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;

import androidx.annotation.NonNull;


import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.parkingSS_user.Activity.MainActivity;
import com.user.parkingSS_user.Activity.Payment;
import com.user.parkingSS_user.Activity.Profile;
import com.user.parkingSS_user.Activity.Status;
import com.user.parkingSS_user.R;

public class BottomNavHelper {

    public static void enableNavigation(final Context context, BottomNavigationView view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case  R.id.home:
                        Intent intent = new Intent(context, MainActivity.class);
                        context.startActivity(intent);
                        break;

                    case R.id.income:
                        Intent intent1 = new Intent(context, Payment.class);
                        context.startActivity(intent1);
                        break;

                    case R.id.status:
                        Intent intent3 = new Intent(context, Status.class);
                        context.startActivity(intent3);
                        break;

                    case R.id.profile:
                        Intent intent2 = new Intent(context, Profile.class);
                        context.startActivity(intent2);
                        break;


                }
                return false;
            }
        });
    }

}

