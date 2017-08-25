package com.example.codetribe.tourguide;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by codetribe on 8/17/2017.
 */

public class Tab4 extends Fragment {
    private ListView listView;
    private SharedPreferences sharedPreferences;
    private String selectedMenu = "";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view  = inflater.inflate(R.layout.tab4_fragment,container,false);
        return  view;
    }
}
