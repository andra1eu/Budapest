package com.example.andralung.budapest.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.andralung.budapest.fragments.PlaceFragment;
import com.example.andralung.budapest.model.Place;

import java.util.ArrayList;

public class PlaceAdapter extends FragmentPagerAdapter {

    private final ArrayList<Place> places;

    public PlaceAdapter(FragmentManager fm, ArrayList<Place> places) {
        super(fm);
        this.places = places;
    }

    @Override
    public Fragment getItem(int position) {
        Place place = places.get(position);
        return PlaceFragment.getInstance(place);
    }

    @Override
    public int getCount() {
        return places.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Place place = places.get(position);
        return place.getTitle();
    }
}
