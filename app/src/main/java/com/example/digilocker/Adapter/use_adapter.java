package com.example.digilocker.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.digilocker.Model.use_model;
import com.example.digilocker.R;

import java.util.ArrayList;
import java.util.List;

public class use_adapter extends RecyclerView.Adapter<use_adapter.viewHolder>  {

    ArrayList<use_model> list;
    Context context;
    public use_adapter(ArrayList<use_model> list , Context context){
        this.list =list;
        this.context = context;

    }
    List<use_model> initdata;
    public use_adapter(List<use_model> initdata) {
        this.initdata=initdata;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.use_sample , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {

        use_model model = list.get(position);

        holder.imageView.setImageResource(model.getPic());

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Image Has been Clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView2);
        }
    }
}
