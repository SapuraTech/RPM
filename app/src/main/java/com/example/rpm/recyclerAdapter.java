package com.example.rpm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder> {

    private ArrayList<Notification> notificationList;

    public recyclerAdapter(ArrayList<Notification>notificationList){
        this.notificationList = notificationList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitle, txtSubtitle, txtTimer;

        public MyViewHolder(final View view){
            super(view);
            txtTitle = view.findViewById(R.id.txtTitle);
            txtSubtitle = view.findViewById(R.id.txtSubtitle);
            txtTimer = view.findViewById(R.id.txtTimer);
        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_notification, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {

        String title = notificationList.get(position).getTitle();
        String subtitle = notificationList.get(position).getSubtitle();
        String timer = notificationList.get(position).getTimer();
        holder.txtTitle.setText(title);
        holder.txtSubtitle.setText(subtitle);
        holder.txtTimer.setText(timer);

    }

    @Override
    public int getItemCount() {
        return notificationList.size();
    }
}
