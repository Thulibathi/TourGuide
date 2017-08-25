package com.example.codetribe.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewActivity extends AppCompatActivity {
    private ImageView img;
    private TextView rateTextView;
    private TextView description;
    private String title="";
    RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        img = (ImageView) findViewById(R.id.header);
        rateTextView = (TextView) findViewById(R.id.rate_text_view);
        description = (TextView) findViewById(R.id.city_desc);
        rate = (RatingBar) findViewById(R.id.rating_bar);
        Intent intent = getIntent();
        City city = (City) intent.getSerializableExtra("city");
        title =city.getName();
        rateTextView.setText(title);
        description.setText(city.getDescription());
        rate.setRating(city.getRating());
        Picasso.with(this)
                .load(Uri.parse(city.getImageResourceId()))
                .into(img);
    }
}
