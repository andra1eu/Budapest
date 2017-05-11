package com.example.andralung.budapest.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.adapters.PlaceAdapter;
import com.example.andralung.budapest.model.Place;

import java.util.ArrayList;

public class AttractionsFragment extends Fragment {

    public static final String TAG = "AttractionsFragment";
    @BindView(R.id.viewpager)
    ViewPager viewPager;
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    public AttractionsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_attractions, container, false);
        ButterKnife.bind(this, root);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.opera, "Opera House", "The opera house in Budapest stands as one of the most beautiful Neo-Renaissance buildings in Europe. When it was opened in 1884, the city shared the administrative duties of the Austro-Hungarian Empire with Vienna. In fact, Emperor Franz Joseph commissioned its design. Construction included the use of marble and frescos by some of the best artisans of that era. The Budapest Opera House quickly became one of the most prestigious musical institutions in Europe."));
        places.add(new Place(R.drawable.shoes, "The Shoes on the Danube", "The Shoes on the Danube Bank is a memorial in Budapest, Hungary. Conceived by film director Can Togay, he created it on the east bank of the Danube River with sculptor Gyula Pauer to honor the people (mainly Budapest Jews) who were killed by fascist Arrow Cross militiamen in Budapest during World War II. They were ordered to take off their shoes, and were shot at the edge of the water. It represents their shoes left behind on the bank."));
        places.add(new Place(R.drawable.choco, "The Chocolate Museum", "The building of the Museum is quite elegant, stylish. It was a hunting Castle of Count Wagner in 1902 in the midst of a wildlife area. From 1930 they started to call this area Arpadföld (residential area with houses). After in the communist years it served as a public building: school, police, cinema, cultural building. The Municipality selled the building in 1998. Elemér Farkas loved the ruined building at first sight. He saw how the building will look like after renovation."));

        PlaceAdapter adapter = new PlaceAdapter(getChildFragmentManager(), places);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return root;
    }
}
