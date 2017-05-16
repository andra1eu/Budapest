package com.example.andralung.budapest.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.adapters.InterestItemAdapter;
import com.example.andralung.budapest.model.InterestItem;

import java.util.ArrayList;

public class CuisineFragment extends Fragment {
    public static final String TAG = "CuisineFragment";


    public CuisineFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_cuisine, container, false);
        ArrayList<InterestItem> cuisine = new ArrayList<>();
        cuisine.add(new InterestItem(R.drawable.goulash, getString(R.string.goulash), getString(R.string.goulash_description)));
        cuisine.add(new InterestItem(R.drawable.kurtocskalacs, getString(R.string.kurtocs), getString(R.string.kurtoch_description)));
        cuisine.add(new InterestItem(R.drawable.paprika_chicken, getString(R.string.paprika), getString(R.string.paprika_description)));
        cuisine.add(new InterestItem(R.drawable.peppers, getString(R.string.peppers), getString(R.string.peppers_descriptio)));

        ListView listView  = (ListView) root.findViewById(R.id.list_view);
        InterestItemAdapter adapter = new InterestItemAdapter(getContext(), cuisine);
        listView.setAdapter(adapter);

        return root;
    }

}
