package com.example.squid.myapplication;

import java.util.List;

/**
 * Created by squid on 10/17/2015.
 */
public class response {
    {
//classify cuisine from recipe api
// this link will take you to the api I am using       https://market.mashape.com/webknox/recipe
//username: a.salem2@yahoo.com password: alter9ego
        //go to hungerstrike and you will be able to access the api key.

    private String cuisine;
    private double confidence;
    private List<String> cuisines;

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getConfidence() {
        return confidence;
    }

    public List<String> getCuisines() {
        return cuisines;
    }
}