package com.example.android.quakereport;

/**
 * Created by moritzmoldenhauer on 28/01/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;

    public Earthquake() {

    }

    public Earthquake(String magnitude, String location, String date) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public void setMagnitude(String magnitude) {
        this.mMagnitude = magnitude;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public void setTime(String time) {
        this.mDate = time;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public String getTime() {
        return mDate;
    }
}
