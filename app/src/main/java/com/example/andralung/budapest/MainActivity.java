package com.example.andralung.budapest;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.andralung.budapest.adapters.InterestItemAdapter;
import com.example.andralung.budapest.fragments.AttractionsFragment;
import com.example.andralung.budapest.fragments.CuisineFragment;
import com.example.andralung.budapest.fragments.CurrencyFragment;
import com.example.andralung.budapest.fragments.HistoryFragment;
import com.example.andralung.budapest.fragments.PocketDictionaryFragment;
import com.example.andralung.budapest.fragments.RestaurantsFragment;
import com.example.andralung.budapest.model.InterestItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private InterestItemAdapter adapter;
    private FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getSupportFragmentManager();

        ArrayList<InterestItem> interestItem = new ArrayList<>();
        interestItem.add(new InterestItem(R.drawable.borbirosag, getString(R.string.restaurants)));
        interestItem.add(new InterestItem(R.drawable.choco, getString(R.string.attractions)));
        interestItem.add(new InterestItem(R.drawable.dex, getString(R.string.pocket)));
        interestItem.add(new InterestItem(R.drawable.parliament, getString(R.string.history)));
        interestItem.add(new InterestItem(R.drawable.forint, getString(R.string.currency)));
        interestItem.add(new InterestItem(R.drawable.goulash, getString(R.string.cuisine)));

        adapter = new InterestItemAdapter(this, interestItem);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                manager.beginTransaction()
                        .replace(R.id.container, new RestaurantsFragment(), RestaurantsFragment.TAG)
                        .addToBackStack(RestaurantsFragment.TAG)
                        .commit();
                break;
            case 1:
                manager.beginTransaction()
                        .replace(R.id.container, new AttractionsFragment(), AttractionsFragment.TAG)
                        .addToBackStack(AttractionsFragment.TAG)
                        .commit();
                break;
            case 2:
                manager.beginTransaction()
                        .replace(R.id.container, new PocketDictionaryFragment(), PocketDictionaryFragment.TAG)
                        .addToBackStack(PocketDictionaryFragment.TAG)
                        .commit();
                break;
            case 3:
                manager.beginTransaction()
                        .replace(R.id.container, new HistoryFragment(), HistoryFragment.TAG)
                        .addToBackStack(HistoryFragment.TAG)
                        .commit();
                break;
            case 4:
                manager.beginTransaction()
                        .replace(R.id.container, new CurrencyFragment(), CurrencyFragment.TAG)
                        .addToBackStack(CurrencyFragment.TAG)
                        .commit();
                break;
            case 5:
                manager.beginTransaction()
                        .replace(R.id.container, new CuisineFragment(), CuisineFragment.TAG)
                        .addToBackStack(CuisineFragment.TAG)
                        .commit();


        }
    }


}
