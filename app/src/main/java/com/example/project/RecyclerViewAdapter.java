package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import com.squareup.picasso.Picasso;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Mushroom> mushrooms;
    private LayoutInflater layoutInflater;
    private OnClickListener onClickListener;

    RecyclerViewAdapter(Context context, List<Mushroom> mushrooms, OnClickListener onClickListener) {
        this.layoutInflater = LayoutInflater.from(context);
        this.mushrooms = mushrooms;
        this.onClickListener = onClickListener;
    }

    @Override
    @NonNull
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(layoutInflater.inflate(R.layout.mushroom, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(mushrooms.get(position).getName());
        holder.location.setText("Grows in: " + mushrooms.get(position).getLocation() + ".");
        holder.edibility.setText("Edibility: " + mushrooms.get(position).getEdibility()+ ".");
        holder.price.setText("Price: " + mushrooms.get(position).getPrice() + " sek/kg.");
        holder.height.setText("Height: c:a  " + mushrooms.get(position).getHeight() + " cm.");
        Picasso.get().load(mushrooms.get(position).getMushroomPic()).into(holder.mushroompic);
    }

    @Override
    public int getItemCount() {
        return mushrooms.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title;
        TextView location;
        TextView edibility;
        TextView height;
        TextView price;
        ImageView mushroompic;

        ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            title = itemView.findViewById(R.id.title);
            location = itemView.findViewById(R.id.location);
            edibility = itemView.findViewById(R.id.edibility);
            price = itemView.findViewById(R.id.price);
            height = itemView.findViewById(R.id.height);
            mushroompic = itemView.findViewById(R.id.mushroompic);
        }

        @Override
        public void onClick(View view) {
            onClickListener.onClick(mushrooms.get(getAdapterPosition()));
        }
    }

    public interface OnClickListener {
        void onClick(Mushroom mushroom);
    }
}
