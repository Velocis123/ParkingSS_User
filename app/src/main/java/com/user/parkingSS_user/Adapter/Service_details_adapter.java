package com.user.parkingSS_user.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.user.parkingSS_user.Model.Drivers;
import com.user.parkingSS_user.R;
import com.user.parkingSS_user.Utility.OnHotelListener;

import java.util.List;

public class Service_details_adapter extends  RecyclerView.Adapter<Service_details_adapter.MyViewHolder> {

    private Context mContext;
    private List<Drivers> usersList;
    private OnHotelListener listener;

    public Service_details_adapter(Context mContext, List<Drivers> usersList, OnHotelListener listener) {
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
        myViewHolder.vtype.setText(users.getVehicle_type());
        myViewHolder.income.setText(users.getCharges() + " /-");
        myViewHolder.img_profile.setImageResource(users.getImg_demo());


    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

TextView name,type,vtype,income;
ImageView img_profile;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
name = itemView.findViewById(R.id.txt_name);
            type = itemView.findViewById(R.id.txt_type);
            vtype = itemView.findViewById(R.id.txt_vtype);
            income = itemView.findViewById(R.id.txt_income);
            img_profile = itemView.findViewById(R.id.img_profile);

        }
        public void bind(final Drivers hotel, final OnHotelListener listener) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(hotel);
                }
            });
        }

    }






}
