package com.example.yummy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.yummy.adapter.RecycleViewAdapter;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerData[] recyclerData = new RecyclerData[]{
                new RecyclerData("Avengers","2019 film",R.drawable.food),
                new RecyclerData("Venom","2018 film",R.drawable.food),
                new RecyclerData("Batman Begins","2005 film",R.drawable.food),
                new RecyclerData("Jumanji","2019 film",R.drawable.food),
                new RecyclerData("Good Deeds","2012 film",R.drawable.food),
                new RecyclerData("Hulk","2003 film",R.drawable.food),
                new RecyclerData("Avatar","2009 film",R.drawable.food),
        };

        RecycleViewAdapter myAdapter = new RecycleViewAdapter(recyclerData,HomeActivity.this);
        recyclerView.setAdapter(myAdapter);

    }
}