package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.List;

public class OpenActivity extends AppCompatActivity {

    private DBHelper db;
    private List<Wine> wineList;
    private ListView wineListView;

    private int mResourceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open);
    }

    public View getWineView(int pos, View convertView, ViewGroup parent){
        final Wine selectedWine = wineList.get(pos);
    }
    
}
