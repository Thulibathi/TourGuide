package com.example.codetribe.tourguide;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by codetribe on 8/17/2017.
 */

public class Tab5 extends Fragment {
    private ImageView img;
    private TextView rateTextView;
    private TextView description;
    private String title="";
    RatingBar rate;
    private SharedPreferences sharedPreferences;
    private String selectedMenu;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view  = inflater.inflate(R.layout.activity_airport,container,false);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        selectedMenu = sharedPreferences.getString("title", "");
        img = (ImageView) view.findViewById(R.id.header);
        rateTextView = (TextView) view.findViewById(R.id.rate_text_view);
        description = (TextView) view.findViewById(R.id.city_desc);
        rate = (RatingBar) view.findViewById(R.id.rating_bar);
        City city = prepareData();
        title =city.getName();
        rateTextView.setText(title);
        description.setText(city.getDescription());
        rate.setRating(city.getRating());
        Picasso.with(getContext())
                .load(Uri.parse(city.getImageResourceId()))
                .into(img);
        return  view;
    }
    private City prepareData(){
        City city = null;
        switch (selectedMenu) {
            case "Airport":
                 city = new City("Polokwane International Airport","Polokwane International Airport (PTG), also known as Pietersburg International Airport or Gateway International Airport, is a small airport located in Polokwane that serves as an international port of entry into the Limpopo province. The airport opened in 1996 on the site of a former air force base and is easily accessible by road or rail.\n" +
                        "\n" +
                        "The airport boasts a world class terminal building which is in excess of 4,000 square meters, with ample retail and commercial space to meet the demands of discerning travellers. The airport has 4 aprons with a parking capacity of 74,800m², modern air traffic control, excellent navigational aids, and 2 serviced runways.","http://www.gaal.co.za/wp-content/uploads/2015/12/9.jpg",0);
        }
        return city;
    }
}
