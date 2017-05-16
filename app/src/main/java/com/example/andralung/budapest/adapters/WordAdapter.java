package com.example.andralung.budapest.adapters;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.andralung.budapest.R;
import com.example.andralung.budapest.model.Word;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

@SuppressWarnings("ConstantConditions")
public class WordAdapter extends ArrayAdapter<Word> {
    private MediaPlayer mediaPlayer;

    public WordAdapter(@NonNull Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Word word = getItem(position);
        ViewHolder holder;
        if (convertView != null) {
            holder = (ViewHolder) convertView.getTag();
        } else {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.word_item, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }

        holder.englishText.setText(word.getEnglishTranslation());
        holder.hungarianText.setText(word.getHungarianTranslation());
        holder.imageView.setImageResource(word.getImage());
        holder.imageView.setTag(position);

        return convertView;
    }

    public void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }


    class ViewHolder implements MediaPlayer.OnCompletionListener {
        @BindView(R.id.image_sound)
        ImageView imageView;
        @BindView(R.id.english_translation)
        TextView englishText;
        @BindView(R.id.hungarian_translation)
        TextView hungarianText;


        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }

        @OnClick(R.id.image_sound)
        void makeSound(View v) {
            releaseMediaPlayer();

            int position = (int) v.getTag();
            Word word = getItem(position);

            mediaPlayer = MediaPlayer.create(getContext(), word.getSound());
            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(this);
        }

        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    }
}
