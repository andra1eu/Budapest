package com.example.andralung.budapest.model;

public class InterestItem {

    private final String interestSection;
    private final int interestIcon;

    public InterestItem(int interestIcon, String interestSection) {

        this.interestSection = interestSection;
        this.interestIcon = interestIcon;
    }


    public String getInterestSection() {
        return interestSection;
    }

    public int getInterestIcon() {
        return interestIcon;
    }
}
