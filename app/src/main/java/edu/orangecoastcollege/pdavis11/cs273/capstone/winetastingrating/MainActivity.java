package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RatingListAdapter ratingsListAdapter;
    private ListView ratingsListView;

    private ArrayList<Rating> ratingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_6);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Rating rating =
                        new Rating(i+1, j+1);
                ratingList.add(rating);
            }
        }
/*
        Intent wineNotesIntent = getIntent();
        String varietalIntent = wineNotesIntent.getStringExtra("Varietal");
        String vintageIntent = wineNotesIntent.getStringExtra("Vintage");
        String wineryIntent = wineNotesIntent.getStringExtra("Winery");
        String vineyardIntent = wineNotesIntent.getStringExtra("Vineyard");
        String priceIntent = wineNotesIntent.getStringExtra("Price");
*/
        ratingsListAdapter = new RatingListAdapter(this, R.layout.activity_wine_list, ratingList);
        ratingsListView = (ListView) findViewById(R.id.ratingListView);
        ratingsListView.setAdapter(ratingsListAdapter);
    }

    public void colorFragment(View v) { Log.i("Main Activity", "colorFragment"); }
    public void aromaFragment(View v) { Log.i("Main Activity", "aromaFragment"); }
    public void bodyFragment(View v) { Log.i("Main Activity", "bodyFragment"); }
    public void tasteFragment(View v) { Log.i("Main Activity", "tasteFragment"); }
    public void finishFragment(View v) { Log.i("Main Activity", "finishFragment"); }
}
