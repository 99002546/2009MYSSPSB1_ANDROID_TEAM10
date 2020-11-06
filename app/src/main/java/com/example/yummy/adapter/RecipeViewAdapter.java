package com.example.yummy.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yummy.ApiActivity;
import com.example.yummy.DetailsActivity;
import com.example.yummy.R;
import com.example.yummy.RecipeData;

public class RecipeViewAdapter extends RecyclerView.Adapter<RecipeViewAdapter.ViewHolder> {

    RecipeData[] recipeData;
    Context context;

    public RecipeViewAdapter(RecipeData[] recipeData, DetailsActivity activity) {
        this.recipeData = recipeData;
        this.context = activity;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_method,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RecipeData recipeDataList = recipeData[position];
        holder.textViewData.setText(recipeDataList.getData());
        //holder.textViewQuantity.setText(recipeDataList.getQuantity());
        //holder.textViewMethod.setText(recipeDataList.getMethod());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String position = "1";
                Intent intent1 = new Intent(context, ApiActivity.class);
                //intent1.putExtra("position", position);
                context.startActivity(intent1);

            }
        });
    }

    @Override
    public int getItemCount() {
        return recipeData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        //TextView textViewMethod;
        TextView textViewData;
        //TextView textViewQuantity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            movieImage = itemView.findViewById(R.id.imageview);
            textViewData = itemView.findViewById(R.id.cardMethod);
            //textViewQuantity = itemView.findViewById(R.id.ingdQuantity);

        }
    }

}