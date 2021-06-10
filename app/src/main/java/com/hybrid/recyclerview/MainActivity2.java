package com.hybrid.recyclerview;



import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hybrid.recyclerView.Adapter.RecentsAdapter;

import com.hybrid.recyclerView.Modal.RecentsData;


import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    RecyclerView recentRecycler,topPlacesRecycler;
    RecentsAdapter recentsAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.MainActivity2);

        List<RecentsData> recentDataList = new ArrayList<>();
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.des));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.dse1));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.first));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.dse1));
        recentDataList.add(new RecentsData("Naran","pakistan","FromS200",R.drawable.des));

        setRecentRecycler(recentDataList);
    }



    private void setRecentRecycler(List<RecentsData> recentDataList){
        recentRecycler=(RecyclerView)findViewById(R.id.Recent_recycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter =new RecentsAdapter(this,recentDataList);
        recentRecycler.setAdapter(recentsAdapter);
    }
}