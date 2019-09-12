package com.project.pricelist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.PriceViewHolder> {
    ArrayList<String> item_name;
    ArrayList<String> item_price;
    ArrayList<Integer> item_image;
    Context context;
    public ListAdapter(Context context, ArrayList<String> name, ArrayList<String> price, ArrayList<Integer> image){

        this.context = context;
        this.item_name = name;
        this.item_price = price;
        this.item_image = image;

    }
    @NonNull
    @Override
    public ListAdapter.PriceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent, false);
        PriceViewHolder priceViewHolder = new PriceViewHolder(v);
        return priceViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.PriceViewHolder holder, int position) {

        holder.image.setImageResource(item_image.get(position));
        holder.itemName.setText(item_name.get(position));
        holder.itemPrice.setText(item_price.get(position));
        holder.buyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, PriceActivity.class);
                context.startActivity(intent);
            }
        });

    }
    @Override
    public int getItemCount() {
        return item_name.size();
    }

    public class PriceViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView itemName;
        TextView itemPrice;
        TextView buyNow;

        public PriceViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            itemName = itemView.findViewById(R.id.item_name);
            itemPrice = itemView.findViewById(R.id.item_price);
            buyNow = itemView.findViewById(R.id.buy);
        }

    }
}
