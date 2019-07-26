package com.user.parkingSS_user.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;


import com.user.parkingSS_user.Application.Flag;
import com.user.parkingSS_user.Model.Drivers;
import com.user.parkingSS_user.R;
import com.user.parkingSS_user.Utility.OnCustomListener;

import java.util.List;

public class Service_details_adapter extends  RecyclerView.Adapter<Service_details_adapter.MyViewHolder> {

    private Context mContext;
    private List<Drivers> usersList;
    private OnCustomListener listener;
    private Flag flag;
    public Service_details_adapter(Context mContext, List<Drivers> usersList, OnCustomListener listener) {
        this.mContext = mContext;
        this.usersList = usersList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_payment, viewGroup, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        UniversalImageLoader universalImageLoader = new UniversalImageLoader(mContext);
//        ImageLoader.getInstance().init(universalImageLoader.getConfig());

        myViewHolder.bind(usersList.get(i), listener);
        Drivers users = usersList.get(i);
//
//        UniversalImageLoader.setImage(amenities.getAmenities_img(),myViewHolder.img_amenities,null,"https://");

        myViewHolder.name.setText(users.getName());
        myViewHolder.type.setText(users.getType());
        myViewHolder.date.setText(users.getDate());
        myViewHolder.income.setText(users.getCharges() + " /-");
        myViewHolder.img_profile.setImageResource(users.getImg_demo());
      //  myViewHolder.time.setText(users.getTime());

        flag = new Flag();

        if (flag.isFlag()){

            myViewHolder.card3.setVisibility(View.VISIBLE);

        }else {
            myViewHolder.card3.setVisibility(View.GONE);

        }


    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

TextView name,type,date,income,time;
ImageView img_profile;
CardView card3;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
name = itemView.findViewById(R.id.txt_name);
            type = itemView.findViewById(R.id.txt_type);
            date = itemView.findViewById(R.id.txt_date);
            income = itemView.findViewById(R.id.txt_income);
img_profile = itemView.findViewById(R.id.img_profile);
            card3 = itemView.findViewById(R.id.card3);
            time = itemView.findViewById(R.id.txt_time);

        }
        public void bind(final Drivers hotel, final OnCustomListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(hotel);
                }
            });
        }

    }






}
