//package com.example.yummy.adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.yummy.DetailsActivity;
//import com.example.yummy.R;
//
//public class MethodViewAdapter extends RecyclerView.Adapter<MethodViewAdapter.ViewHolder> {
//
//    RecipeData[] recipeData;
//    Context context;
//
//    public MethodViewAdapter(RecipeData[] recipeData, DetailsActivity activity) {
//        this.recipeData = recipeData;
//        this.context = activity;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
//        View view = layoutInflater.inflate(R.layout.recycler_view_method,parent,false);
//        ViewHolder viewHolder = new ViewHolder(view);
//        return viewHolder;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        final RecipeData recipeDataList = recipeData[position];
////        holder.textViewIngredients.setText(recipeDataList.getIngredients());
////        holder.textViewQuantity.setText(recipeDataList.getQuantity());
//        holder.textViewMethod.setText(recipeDataList.getMethod());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return recipeData.length;
//    }
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder{
//        TextView textViewMethod;
////        TextView textViewIngredients;
////        TextView textViewQuantity;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            textViewMethod = itemView.findViewById(R.id.cardMethod);
////            textViewIngredients = itemView.findViewById(R.id.ingdItem);
////            textViewQuantity = itemView.findViewById(R.id.ingdQuantity);
//
//        }
//    }
//
//}