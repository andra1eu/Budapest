package com.example.andralung.budapest.fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.adapters.PlaceAdapter;
import com.example.andralung.budapest.model.Place;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RestaurantsFragment extends Fragment {

    public static final String TAG = "RestaurantsFragment";

    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_restaurants, container, false);
        ButterKnife.bind(this, root);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.drawable.borbirosag, getString(R.string.Borbiróság), getString(R.string.Borbiróság_description)));
        places.add(new Place(R.drawable.doblo, getString(R.string.doblo), getString(R.string.doblo_description)));
        places.add(new Place(R.drawable.tamp, getString(R.string.tamp), getString(R.string.tamp_description)));

        PlaceAdapter adapter = new PlaceAdapter(getChildFragmentManager(), places);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return root;
    }
}
