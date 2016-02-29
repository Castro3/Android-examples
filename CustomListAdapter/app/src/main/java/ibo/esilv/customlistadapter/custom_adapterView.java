package ibo.esilv.customlistadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mcas on 29/02/2016.
 */
public class custom_adapterView extends ArrayAdapter<cakeData> {

    ArrayList<cakeData> mockData;

    public custom_adapterView(Context context, int resource, ArrayList<cakeData> objects) {
        super(context, resource, objects);
        mockData = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        cakeData myCake = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }
        // Lookup view for data population
        TextView cakeName = (TextView) convertView.findViewById(R.id.cakeName);
        TextView cakeRate = (TextView) convertView.findViewById(R.id.cakeRate);
        // Populate the data into the template view using the data object
        cakeName.setText(myCake.getName());
        cakeRate.setText(String.valueOf(myCake.getRate()));

        // Return the completed view to render on screen

        return convertView;
    }


    /*
    private static class ViewHolder {
        TextView name;
        TextView home;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        cakeData myCake = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_layout, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.cakeName);
            viewHolder.home = (TextView) convertView.findViewById(R.id.cakeRate);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.name.setText(myCake.getName());
        viewHolder.home.setText(String.valueOf(myCake.getRate()));
        // Return the completed view to render on screen
        return convertView;
    }
    */

}
