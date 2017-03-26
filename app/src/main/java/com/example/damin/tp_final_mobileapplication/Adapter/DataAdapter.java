package com.example.damin.tp_final_mobileapplication.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.damin.tp_final_mobileapplication.Interface.OnItemSelectedListener;
import com.example.damin.tp_final_mobileapplication.Model.Video;
import com.example.damin.tp_final_mobileapplication.R;
import com.example.damin.tp_final_mobileapplication.ViewHolder.ViewHolder;

import java.util.List;

/**
 * Created by damin on 17/03/2017.
 */



public class DataAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<Video.Item> ItemList;
    private Context context;
    OnItemSelectedListener onItemSelectedListener;

    public DataAdapter(Context context,List<Video.Item> ItemList) {
        this.context = context;
        this.ItemList= ItemList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        viewHolder.setOnItemSelectedListener(onItemSelectedListener);
        viewHolder.bind(ItemList.get(i),context);

    }

    @Override
    public int getItemCount() {
        return ItemList.size();
    }


    public void setOnItemSelectedListener(OnItemSelectedListener onItemSelectedListener) {
        this.onItemSelectedListener = onItemSelectedListener;
    }


}
