package com.example.codetribe.tourguide;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by codetribe on 8/4/2017.
 */

public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder>
{
    private List<City> cities;
    private Context context;

    public CityAdapter(Context context, List<City> information) {
        this.context = context;
        this.cities = information;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.simple_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

       final City city = cities.get(i);

        viewHolder.txtName.setText(cities.get(i).getName());
        viewHolder.txtDesc.setText(cities.get(i).getDescription());
//        viewHolder.ratingBar.setRating(cities.get(i).getRating());
        Log.i("Ygritte",cities.get(i).getImageResourceId());

        Picasso.with(context).load(cities.get(i).getImageResourceId()).into(viewHolder.img);

        viewHolder.txtViewMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,ViewActivity.class);
                intent.putExtra("city",city);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtDesc;
        TextView txtName;
        TextView txtViewMore;
        RatingBar ratingBar;
        ImageView img;

        CardView cd;

        public ViewHolder(View view) {
            super(view);

            txtName = (TextView)view.findViewById(R.id.area_name);
            txtDesc = (TextView)view.findViewById(R.id.description);
            txtViewMore = (TextView)view.findViewById(R.id.view_more);
            ratingBar = (RatingBar) view.findViewById(R.id.rating_bar);
            img = (ImageView)view.findViewById(R.id.image);
            cd =(CardView)view.findViewById(R.id.card);
        }
    }
}
