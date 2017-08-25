package com.example.codetribe.tourguide;

import java.io.Serializable;

/**
 * Created by codetribe on 8/1/2017.
 */

public class City implements Serializable{

    //private String[] categories = {"Accommodation","Attractions","Events","Airport","Shopping"};
    //private String[][] sections ={{"Hotel,B&b","Lodges"},{"Museums","Nature","Culture","Parks"},{"Events"},{"Airport"},{"Mall","Plaza"}};

    private String name;

    private String description;

    private String imageResourceId = "";

    private int distance = 0;

    private float rating;

    public City(String name, String description, String imageResourceId, float rating) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
        this.rating = rating;
    }
    public City(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getImageResourceId() {
        return imageResourceId;
    }

    public int getDistance() {
        return distance;
    }

    public float getRating() {
        return rating;
    }
/* public int count( int a)
    {
        return sections[a].length;
    }

    public String getCategory(int a)
    {
        return categories[a];
    }

    public String getSection(int a)
    {
        return sections[a][count(a)];
    }*/
}
