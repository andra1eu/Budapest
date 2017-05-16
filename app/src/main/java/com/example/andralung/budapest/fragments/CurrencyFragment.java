package com.example.andralung.budapest.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.andralung.budapest.R;
import com.example.andralung.budapest.adapters.WordAdapter;
import com.example.andralung.budapest.model.Word;

import java.util.ArrayList;

public class CurrencyFragment extends Fragment {
    public static final String TAG = "CurrencyFragment";

    public CurrencyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_currency, container, false);

        ArrayList<Word> money = new ArrayList<>();
        money.add(new Word(getString(R.string.dollar1), getString(R.string.forint_dollar), R.drawable.forint, 0));
        money.add(new Word(getString(R.string.euro), getString(R.string.forint_euro), R.drawable.forint, 0));
        money.add(new Word(getString(R.string.gbp), getString(R.string.forint_gbp), R.drawable.forint, 0));
        money.add(new Word(getString(R.string.leu), getString(R.string.forint_leu), R.drawable.forint, 0));
        WordAdapter adapter = new WordAdapter(getContext(), money);
        ListView listView = (ListView) root.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        return root;
    }

}
