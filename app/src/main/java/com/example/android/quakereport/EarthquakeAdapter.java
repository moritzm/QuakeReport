package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by moritzmoldenhauer on 28/01/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake earthquake = getItem(position);

        TextView magnitudeText = (TextView) listItemView.findViewById(R.id.magnitude_TextView);
        magnitudeText.setText(String.valueOf(earthquake.getMagnitude()));

        TextView locationText = (TextView) listItemView.findViewById(R.id.location_TextView);
        locationText.setText(String.valueOf(earthquake.getPlace()));

        TextView timeText = (TextView) listItemView.findViewById(R.id.date_TextView);
        timeText.setText(String.valueOf(earthquake.getTime()));

        return listItemView;
    }
}
