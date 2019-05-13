package com.example.euriskoapp.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.euriskoapp.POJO.User;
import com.example.euriskoapp.R;

import java.util.ArrayList;

/**
 * Created by Ramy on 5/13/2019.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private LayoutInflater inflater;
    private ArrayList<User> dataList;

    public RecyclerViewAdapter(Context ctx, LayoutInflater inflater, ArrayList<User> dataList) {
        inflater = LayoutInflater.from(ctx);
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = inflater.inflate(R.layout.recycler_item_row, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        holder.userId.setText(dataList.get(position).getUserId());
        holder.id.setText(dataList.get(position).getId());
        holder.title.setText(dataList.get(position).getTitle());
//        holder.completed.setText(dataList.get(position).isCompleted());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView userId, id, title, completed;

        ViewHolder(View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.userId);
            id = itemView.findViewById(R.id.id);
            title = itemView.findViewById(R.id.title);
            completed = itemView.findViewById(R.id.completed);
        }

    }
}
