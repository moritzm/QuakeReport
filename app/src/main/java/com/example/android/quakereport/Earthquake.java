package com.example.android.quakereport;

/**
 * Created by moritzmoldenhauer on 28/01/2017.
 */

public class Earthquake {

    private double magnitude;
    private String place;
    private String time;

    public Earthquake() {

    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public String getPlace(){
        return place;
    }

    public String getTime() {
        return time;
    }
}
