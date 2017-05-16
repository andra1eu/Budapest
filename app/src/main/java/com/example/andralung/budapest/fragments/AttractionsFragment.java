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
        places.add(new Place(R.drawable.opera, getString(R.string.opera_house), getString(R.string.opera_description)));
        places.add(new Place(R.drawable.shoes, getString(R.string.shoes_danube), getString(R.string.shoes_description)));
        places.add(new Place(R.drawable.choco, getString(R.string.choco_museum), getString(R.string.choco_description)));

        PlaceAdapter adapter = new PlaceAdapter(getChildFragmentManager(), places);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return root;
    }
}
