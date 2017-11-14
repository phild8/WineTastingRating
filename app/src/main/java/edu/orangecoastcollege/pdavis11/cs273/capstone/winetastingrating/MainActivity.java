package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RatingListAdapter ratingsListAdapter;
    private ListView ratingsListView;

    private ArrayList<Rating> ratingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scoring_6);



        /*
        TEST
         */
        Rating rate1 = new Rating(1, 1, 1, 1, 1, 1, 1, 1, 1, "1");
        Rating rate2 = new Rating(2, 2, 2, 2, 2, 2, 2, 2, 2, "2");
        Rating rate3 = new Rating(3, 3, 3, 3, 3, 3, 3, 3, 3, "3");
        ratingList.add(rate1);
        ratingList.add(rate2);
        ratingList.add(rate3);
        /*
        TEST
         */

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                Rating rating =
                        new Rating(i, j);
                ratingList.add(rating);
            }
        }

        /*
        Added - From - AddNotesActivity.java
        TODO: Convert: vintage => int; price => double

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
}