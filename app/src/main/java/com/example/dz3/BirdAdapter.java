package com.example.dz3;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.ViewHolder> {


    private final LayoutInflater inflater;
    private final List<Bird> birds;


    public BirdAdapter(Context context, List<Bird> animals) {
        this.inflater = LayoutInflater.from(context);
        this.birds = animals;
    }

    @Override
    public BirdAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(BirdAdapter.ViewHolder holder, int position) {
        Bird animal = birds.get(position);
        holder.animalView.setImageResource(animal.getAnimalResource());
        holder.nameView.setText(animal.getName());
        holder.animalDescriptionView.setText(animal.getAnimalDescription());
        holder.populationSizeView.setText(animal.getPopulationSize());
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView animalView;
        final TextView nameView, animalDescriptionView, populationSizeView;

        ViewHolder(View view) {
            super(view);
            animalView = view.findViewById(R.id.animalResource);
            nameView = view.findViewById(R.id.name);
            animalDescriptionView = view.findViewById(R.id.animalDescription);
            populationSizeView = view.findViewById(R.id.populationSize);
        }
    }
}