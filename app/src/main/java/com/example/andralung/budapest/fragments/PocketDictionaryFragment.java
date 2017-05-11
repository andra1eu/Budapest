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
        words.add(new Word("How are you?", "\nHogy vagy?", R.drawable.listen, R.raw.audio));
        words.add(new Word("What is your name?", "\nMi a neved?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Where is the opera?", "\nHol van az opera?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Can you take us a picture?", "\nKépzelhetsz nekünk egy képet?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Where is the restaurant?", "\nMerre van az étterem?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Where can I find a good hotel?", "\nHol találok egy jó szállodát?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Can you help me, please?", "\nTudnál segíteni?", R.drawable.listen, R.raw.audio));
        words.add(new Word("Where can I find an exchange?", "\nHol találhatok cserét?", R.drawable.listen, R.raw.audio));

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
