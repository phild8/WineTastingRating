package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.List;

public class OpenActivity extends AppCompatActivity {

    private DBHelper db;
    private List<Wine> winesList;
    private ListView winesListView;
    private WinePreviewListAdapter wineAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);

        db = new DBHelper(this);

        db.addWine(new Wine("Zinfandel", 2013, "Newport Beach Vineyards and Winery", "Carlisle", 20.3 ));
        db.addWine(new Wine("Merlot", 2016, "Laguna Canyon Winery", "Ridgeback", 40.7 ));
        db.addWine(new Wine("Pinot Noir", 2011, "Miramonte Winery", "Carlisle", 38.87 ));

        winesList = db.getAllWines();
        wineAdapter = new WinePreviewListAdapter(this, R.layout.wine_preview_list_item, winesList);
        winesListView = (ListView) findViewById(R.id.wineListView);
        winesListView.setAdapter(wineAdapter);
    }

    public void addNewWine(View view){
        Intent addWineIntent = new Intent(this, AddNotesActivity.class);
        startActivity(addWineIntent);
    }

    public void viewWineDetails(View view){

    }
}
