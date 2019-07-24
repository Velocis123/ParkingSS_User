package com.user.parkingSS_user.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.user.parkingSS_user.R;

public class Vehicle_Type extends AppCompatActivity {
    RelativeLayout rel2,rel5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle__type);

        rel2 = findViewById(R.id.rel2);
        rel5 = findViewById(R.id.rel5);

        rel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_Type.this, Req_Driver.class);
                startActivity(intent);
            }
        });

        rel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Vehicle_Type.this,Req_Driver.class);
                startActivity(intent);
            }
        });



    }
}
