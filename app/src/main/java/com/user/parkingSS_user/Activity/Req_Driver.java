package com.user.parkingSS_user.Activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.user.parkingSS_user.R;

public class Req_Driver extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_req__driver);




    }

    public void fun(View v)
    {
        AlertDialog.Builder ab=new AlertDialog.Builder(this);

        View v1= LayoutInflater.from(this).inflate(R.layout.floating_view_accepted,null,false);

        Button b=v1.findViewById(R.id.ok);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Req_Driver.this,Status.class);
                startActivity(intent);
            }
        });
        ab.setView(v1);

        ab.show();

    }
}
