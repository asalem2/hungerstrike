package com.example.squid.myapplication;

import java.util.List;

/**
 * Created by squid on 10/17/2015.
 */
public class response {

    /**
     * cuisines : ["Mexican"]
     * cuisine : Mexican
     * confidence : 0.1899663233125781
     */

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