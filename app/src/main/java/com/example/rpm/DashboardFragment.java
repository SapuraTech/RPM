package com.example.rpm;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashboardFragment#} factory method to
 * create an instance of this fragment.
 */
public class DashboardFragment extends Fragment {
    BarChart barChart;
    BarData barData;
    BarDataSet barDataSet;
    ArrayList barEntriesArrayList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);

        barChart = (BarChart)view.findViewById(R.id.testBarChart);
        getBarEntries();
        barDataSet = new BarDataSet(barEntriesArrayList,"Calories Burn Summary");

        barData = new BarData(barDataSet);
        barChart.setData(barData);
        barDataSet.setColors(new int[]{ Color.MAGENTA});

        barChart.getDescription().setEnabled(false);

        return view;
    }
    private void getBarEntries(){
        barEntriesArrayList = new ArrayList<>();

        barEntriesArrayList.add(new BarEntry(1f,4));
        barEntriesArrayList.add(new BarEntry(2f, 6));
        barEntriesArrayList.add(new BarEntry(3f, 8));
        barEntriesArrayList.add(new BarEntry(4f, 2));
        barEntriesArrayList.add(new BarEntry(5f, 4));
        barEntriesArrayList.add(new BarEntry(6f, 1));
    }
}