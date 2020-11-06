package com.example.yummy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

//import com.example.yummy.adapter.MethodViewAdapter;
import com.example.yummy.adapter.RecipeViewAdapter;
import com.example.yummy.adapter.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent intent = getIntent();
        String position = intent.getStringExtra("position");

//        RecyclerView recyclerViewIngd = findViewById(R.id.reViewIngd);
//        recyclerViewIngd.setHasFixedSize(true);
//        recyclerViewIngd.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView recyclerViewMethod = findViewById(R.id.recipeView);
        recyclerViewMethod.setHasFixedSize(true);
        recyclerViewMethod.setLayoutManager(new LinearLayoutManager(this));

        if(position.equals("1"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("2"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("3"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("4"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("5"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("6"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("7"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("8"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData, DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("9"))
        {
            RecipeData[] recipeData = new RecipeData[]{
                    new RecipeData("INGREDIENTS"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("hi anna how are you"),
                    new RecipeData("METHODS"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you"),
                    new RecipeData("hi anna how are you hi anna how are you hi anna how are you hi anna how are you")
            };
            RecipeViewAdapter myAdapter = new RecipeViewAdapter(recipeData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }


    }
}