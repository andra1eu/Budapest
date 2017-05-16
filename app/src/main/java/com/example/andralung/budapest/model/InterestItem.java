package com.example.andralung.budapest.model;

public class InterestItem {

    private final String interestSection;
    private final int interestIcon;
    private final String foodDescription;


    public InterestItem(int interestIcon, String interestSection) {
        this(interestIcon, interestSection, null);
    }

    public InterestItem(int interestIcon, String interestSection, String foodDescription) {
        this.interestSection = interestSection;
        this.interestIcon = interestIcon;
        this.foodDescription = foodDescription;
    }


    public String getInterestSection() {
        return interestSection;
    }

    public int getInterestIcon() {
        return interestIcon;
    }

    public String getFoodDescription() {
        return foodDescription;
    }
}