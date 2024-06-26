package com.example.pharmassist.store.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pharmassist.R;
import com.example.pharmassist.store.Model.CategoryModel;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.viewHolder> {
    private Context ctx;
    private List<CategoryModel> categoryModels = new ArrayList<>();
    public CategoryAdapter(Context ctx, List<CategoryModel> categoryModelList) {
        this.ctx = ctx;
        this.categoryModels = categoryModelList;
    }

    @NonNull
    @Override
    public CategoryAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(ctx).inflate(R.layout.item_categories,parent,false);
        return new CategoryAdapter.viewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.viewHolder holder, int position) {
        final CategoryModel categoryModel = categoryModels.get(position);
        holder.categoryTitle.setText(categoryModel.getCategoryTitle());


        //To show the stuff
        Glide.with(ctx).load(categoryModel.getCategoryImage()).into(holder.categoryImage);


    }

    @Override
    public int getItemCount() {

        return categoryModels.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        private ImageView categoryImage;
        private TextView categoryTitle;
        public viewHolder(@NonNull View itemView) {

            super(itemView);
            categoryImage = itemView.findViewById(R.id.iv_categoriesImage);
            categoryTitle= itemView.findViewById(R.id.txt_categoryTitle);


        }
    }
}
