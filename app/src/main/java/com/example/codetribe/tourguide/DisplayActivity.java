package com.example.codetribe.tourguide;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {


    private static final String TAG ="DisplayActivity";
    private SectionPageAdapter sectionPageAdapter;
    private ViewPager viewPager;
    private SharedPreferences sharedPreferences;
    private String selectedMenu = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        sectionPageAdapter = new SectionPageAdapter(getSupportFragmentManager());
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager)
    {
        SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
        selectedMenu = sharedPreferences.getString("title","");
        switch (selectedMenu)
        {
            case "Accommodation":
                adapter.addFragment(new Tab1(),"Hotel");
                adapter.addFragment(new Tab2(),"B&b");
                adapter.addFragment(new Tab3(),"Lodge");
                break;
            case "Attraction":
                adapter.addFragment(new Tab1(),"Nature");
                adapter.addFragment(new Tab2(),"History");
            break;
            case "Airport":
                adapter.addFragment(new Tab5(),"Airport");
                break;
            case "Events":
                adapter.addFragment(new Tab4(),"Events");
                break;
        }
        viewPager.setAdapter(adapter);
    }
}
