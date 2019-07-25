package com.user.parkingSS_user.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.user.parkingSS_user.Application.Flag;
import com.user.parkingSS_user.Fragments.Details_NPaying;
import com.user.parkingSS_user.Fragments.Details_Paying;
import com.user.parkingSS_user.R;

public class Acitivity_Details extends AppCompatActivity {

 // Details_Paying details = new Details_Paying();

    ImageView img_back;

Flag flag ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

       // androidx.fragment.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        img_back = findViewById(R.id.img_back);

        img_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });

            flag =new Flag();
            flag.setFlag(true);

        if (!flag.isFlag()){

            load_fragment(new Details_Paying());


        }else {

            load_fragment(new Details_NPaying());
        }






    }



    private void load_fragment(Fragment fragment){

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();



    }

}
