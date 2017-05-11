package com.example.andralung.budapest.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.model.Place;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PlaceFragment extends Fragment {
    public static final String TAG = "PlaceFragment";

    public static final String TITLE = "title";
    public static final String IMAGE = "image";
    public static final String DESCRIPTION = "description";

    @BindView(R.id.title_place)
    TextView title;
    @BindView(R.id.image_place)
    ImageView image;
    @BindView(R.id.description_place)
    TextView description;

    //creez un obiect de tipul PlaceFragment care are memorat titlul
    public static PlaceFragment getInstance(Place place) {
        PlaceFragment fragment = new PlaceFragment();
        Bundle arguments = new Bundle();
        arguments.putString(TITLE, place.getTitle());
        arguments.putInt(IMAGE, place.getImage());
        arguments.putString(DESCRIPTION, place.getDescription());

        fragment.setArguments(arguments);
        return fragment;
    }

    public PlaceFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_place_item, container, false);
        ButterKnife.bind(this, root);

        Bundle arguments = getArguments();

        String text = arguments.getString(TITLE);
        int imageRes = arguments.getInt(IMAGE);
        String descriptionText = arguments.getString(DESCRIPTION);


        title.setText(text);
        image.setImageResource(imageRes);
        description.setText(descriptionText);

        return root;
    }
}
