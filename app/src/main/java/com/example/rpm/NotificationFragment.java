package com.example.rpm;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class NotificationFragment extends Fragment {

    private ArrayList<Notification> notificationList;
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notification, container, false);

        recyclerView = view.findViewById(R.id.recyclerView);
        notificationList = new ArrayList<>();
        setTitle();
        setAdapter();

        return view;
    }

    private void setAdapter(){
        recyclerAdapter adapter = new recyclerAdapter(notificationList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext().getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
    private void setTitle(){
        notificationList.add(new Notification("Good morning","Have you breakfast yet?","3 min ago"));
        notificationList.add(new Notification("Your weekly report are ready!","See your February report and you can get personalize your calories target","2 days ago"));
        notificationList.add(new Notification("Your weekly report are ready!","See your January report and you can get personalize your calories target","a month ago"));
        notificationList.add(new Notification("Happy New Year 2022","We wishing you a bless New Year, stay healthy & stay fit!","a month ago"));
        notificationList.add(new Notification("Welcome!","Thank you for registering. We are ready to assist you","2 months ago"));

    }
}