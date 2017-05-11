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
        places.add(new Place(R.drawable.borbirosag, "Borbiróság", "Just a stone’s throw from Great Market Hall – from where it sources many of its ingredients – the refreshingly low-key “Wine Court” is one of the more satisfying places to sample modern, affordable Hungarian cuisine. A good choice is the veal with foie gras served with pepper sauce and dumplings (£10.50) and a salty caramel and pear crumble (£2.80) accompanied by a glass of delicious dessert wine tokaj aszú to round off the evening . "));
        places.add(new Place(R.drawable.doblo, "Doblo", "Hungarian wine may not be as famous as some, but it has fantastic pedigree. Among the rash of wine bars that have sprung up throughout the city, the brick-vaulted Doblo, in the atmospheric Jewish quarter, is the most relaxing. It has more than 200 varieties from Hungary’s 22 wine-growing regions, many available by the glass, perhaps paired with a ham and cheese platter. For oenophiles, there are dedicated tasting sessions (£22). "));
        places.add(new Place(R.drawable.tamp, "Tamp & Pull", "Coffee – increasingly of the artisanal variety – is now big business in Budapest, and few places do it quite like Tamp & Pull, one of the new breed of espresso bars. It’s a tiny space but run through with charm, and the coffee is exquisite, lovingly crafted by champion baristas using beans from around the globe, details of which are displayed across the walls. It would also be remiss not to try one of their delectable pastries. "));

        PlaceAdapter adapter = new PlaceAdapter(getChildFragmentManager(), places);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return root;
    }
}
