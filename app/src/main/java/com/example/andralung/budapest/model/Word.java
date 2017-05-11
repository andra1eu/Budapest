package com.example.andralung.budapest.model;


import android.media.MediaPlayer;

public class Word {


    private final String englishTranslation;
    private final String hungarianTranslation;
    private final int image;
    private final int sound;


    public Word(String englishTranslation, String hungarianTranslation, int image, int sound) {

        this.englishTranslation = englishTranslation;
        this.hungarianTranslation = hungarianTranslation;
        this.image = image;
        this.sound = sound;

    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public String getHungarianTranslation() {
        return hungarianTranslation;
    }

    public int getImage() {
        return image;
    }

    public int getSound() {
        return sound;
    }
}
