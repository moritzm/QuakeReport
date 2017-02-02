package com.example.android.quakereport;

/**
 * Created by moritzmoldenhauer on 28/01/2017.
 */

public class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    public Earthquake() {

    }

    public Earthquake(String magnitude, String location, long date) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = date;
    }

    public void setMagnitude(String magnitude) {
        this.mMagnitude = magnitude;
    }

    public void setLocation(String mLocation) {
        this.mLocation = mLocation;
    }

    public void setTime(long time) {
        this.mTimeInMilliseconds = time;
    }

    public String getMagnitude() {
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTime() {
        return mTimeInMilliseconds;
    }
}
