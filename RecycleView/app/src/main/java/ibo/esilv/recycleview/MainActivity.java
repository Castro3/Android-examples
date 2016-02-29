package ibo.esilv.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    private ArrayList<cakeData> mockData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMockData();

        mRecyclerView = (RecyclerView) findViewById(R.id.myList);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Add a line between views
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST);
        mRecyclerView.addItemDecoration(itemDecoration);

        // specify an adapter (see also next example)
        mAdapter = new customListAdapter(mockData);
        mRecyclerView.setAdapter(mAdapter);

    }

    private void createMockData()
    {
        mockData = new ArrayList<cakeData>();
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
        mockData.add(new cakeData("Blue berry cheese cake",5));
        mockData.add(new cakeData("Chocolate cake",3));
        mockData.add(new cakeData("Cheese cake",4));
        mockData.add(new cakeData("Pineapple cake",3));
        mockData.add(new cakeData("Vanilla cake",5));
    }
}
