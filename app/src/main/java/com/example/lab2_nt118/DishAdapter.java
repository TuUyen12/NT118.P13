package com.example.lab2_nt118;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Context;
import java.util.List;

public class DishAdapter extends ArrayAdapter<Dish> {
    private final Context context;
    private final int resource;
    private final List<Dish> dishes;

    public DishAdapter(Context context, int resource, List<Dish> dishes) {
        super(context, resource, dishes);
        this.context = context;
        this.resource = resource;
        this.dishes = dishes;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(resource, null);
        }

        Dish dish = getItem(position);

        return convertView;
    }
}
