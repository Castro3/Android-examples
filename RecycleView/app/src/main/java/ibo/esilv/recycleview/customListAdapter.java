package ibo.esilv.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mcas on 29/02/2016.
 */
public class customListAdapter extends RecyclerView.Adapter<customListAdapter.ViewHolder> {
    ArrayList<cakeData> mockData;

    public static class ViewHolder extends RecyclerView.ViewHolder  {
        TextView name;
        TextView rate;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.cakeName);
            rate = (TextView) itemView.findViewById(R.id.cakeRate);
        }
    }

    public customListAdapter(ArrayList<cakeData> myDataset) {
        mockData = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public customListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.name.setText(mockData.get(position).getName());
        holder.rate.setText(String.valueOf(mockData.get(position).getRate()));
    }

    @Override
    public int getItemCount() {
        return mockData.size();
    }

}
