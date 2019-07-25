package com.user.parkingSS_user.Activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.user.parkingSS_user.Adapter.Service_details_adapter;
import com.user.parkingSS_user.Model.Drivers;
import com.user.parkingSS_user.R;
import com.user.parkingSS_user.Utility.BottomNavHelper;
import com.user.parkingSS_user.Utility.OnCustomListener;

import java.util.ArrayList;
import java.util.List;

public class Payment extends AppCompatActivity {

    private static final int ACTIVITY_NUM = 2;
    Context context = Payment.this;
    RecyclerView rec_income;

    List<Drivers> usersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_nav_view);
        BottomNavHelper.enableNavigation(context,bottomNavigationView);

        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(ACTIVITY_NUM);
        menuItem.setChecked(true);
        setupIncome();


    }


    private void setupIncome(){
        rec_income = findViewById(R.id.rec_income);
        Drivers users = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");

        Drivers users1 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users2 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Temporary","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users3 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users4 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users5 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Temporary","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users6 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Pickup","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");
        Drivers users7 = new Drivers("Akash Gupta","123456789","abcd@gmail.com","",
                "Drop","Regular","10","",R.drawable.ic_car_black,"2:06 PM","25/7/19");

        usersList.add(users);
        usersList.add(users1);
        usersList.add(users2);
        usersList.add(users3);
        usersList.add(users4);
        usersList.add(users5);
        usersList.add(users6);
        usersList.add(users7);

        Service_details_adapter adapter = new Service_details_adapter(Payment.this, usersList, new OnCustomListener() {
            @Override
            public void onItemClick(Drivers item) {
                Intent intent = new Intent(Payment.this, Acitivity_Details.class);
                startActivity(intent);

            }
        });

       // Service_details_adapter service_details_adapter = new Service_details_adapter(this,usersList);
        rec_income.setLayoutManager(new LinearLayoutManager(this,LinearLayout.VERTICAL,false));
        rec_income.setAdapter(adapter);















    }


}
