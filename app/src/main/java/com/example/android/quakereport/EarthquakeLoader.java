package com.example.android.quakereport;

import android.content.Context;
import android.content.AsyncTaskLoader;
import android.text.TextUtils;

import java.util.List;

/**
 * Created by moritzmoldenhauer on 09/02/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (TextUtils.isEmpty(mUrl)) {
            return null;
        }

        List<Earthquake> earthquakes = Utils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
