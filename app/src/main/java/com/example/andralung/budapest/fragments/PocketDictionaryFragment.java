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

import butterknife.BindView;
import butterknife.ButterKnife;

public class PocketDictionaryFragment extends Fragment {
    public static final String TAG = "PocketDictionaryFragment";

    @BindView(R.id.list_view)
    ListView listView;
    private WordAdapter adapter;
    public PocketDictionaryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_pocket_dictionary, container, false);
        ButterKnife.bind(this, root);

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word(getString(R.string.english1), getString(R.string.hung1), R.drawable.listen, R.raw.hogy_vagy));
        words.add(new Word(getString(R.string.english2), getString(R.string.hung2), R.drawable.listen, R.raw.what_is_name));
        words.add(new Word(getString(R.string.english3), getString(R.string.hung3), R.drawable.listen, R.raw.where_opera));
        words.add(new Word(getString(R.string.english4), getString(R.string.hungarian_tr), R.drawable.listen, R.raw.photo));
        words.add(new Word(getString(R.string.english5), getString(R.string.hung5), R.drawable.listen, R.raw.restaurant));
        words.add(new Word(getString(R.string.english6), getString(R.string.hung6), R.drawable.listen, R.raw.good_hotel));
        words.add(new Word(getString(R.string.english7), getString(R.string.hung7), R.drawable.listen, R.raw.can_you_help));
        words.add(new Word(getString(R.string.english8), getString(R.string.hung8), R.drawable.listen, R.raw.exchange));

         adapter = new WordAdapter(getActivity(), words);
        listView.setAdapter(adapter);
        return root;
    }

    @Override
    public void onPause() {
        super.onPause();
        adapter.releaseMediaPlayer();
    }
}
