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
import com.user.parkingSS_user.Utility.OnCustomListener;

import java.util.List;

public class Vehicles_Adapter   extends  RecyclerView.Adapter<Vehicles_Adapter.MyViewHolder> {

    private Context mContext;
    private List<Drivers> usersList;
    private OnCustomListener listener;

    public Vehicles_Adapter(Context mContext, List<Drivers> usersList, OnCustomListener listener) {
        this.mContext = mContext;
        this.usersList = usersList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(mContext)
                .inflate(R.layout.fragment_vehicle, viewGroup, false);

        return new MyViewHolder(itemView);


    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
//        UniversalImageLoader universalImageLoader = new UniversalImageLoader(mContext);
//        ImageLoader.getInstance().init(universalImageLoader.getConfig());


//
//        UniversalImageLoader.setImage(amenities.getAmenities_img(),myViewHolder.img_amenities,null,"https://");




    }



    @Override
    public int getItemCount() {

        return usersList.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {




        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

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
