package ibo.esilv.customlistadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private ArrayList<cakeData> mockData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createMockData();

        ListView myList = (ListView) findViewById(R.id.myList);
        custom_adapterView myAdapter = new custom_adapterView(this,0,mockData);
        myList.setAdapter(myAdapter);
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
