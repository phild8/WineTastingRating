package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jimburk on 11/10/17.
 */

public class RatingListAdapter extends ArrayAdapter<Rating> {
    private Context mContext;
    private List<Rating> mRatingList = new ArrayList<>();
    private int mResourceId;

    public RatingListAdapter(Context c, int rId, List<Rating> ratings) {
        super(c, rId, ratings);
        mContext = c;
        mResourceId = rId;
        mRatingList = ratings;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent)
    {
        final Rating selectedWine = mRatingList.get(pos);

        LayoutInflater inflater =
                (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(mResourceId, null);

        GridLayout ratingListLinearLayout =
                (GridLayout) view.findViewById(R.id.ratingListGridLayout);
        TextView ratingListFlightView =
                (TextView) view.findViewById(R.id.flightNumberTV);
        TextView ratingListColorView =
                (TextView) view.findViewById(R.id.ratingColorTV);
        TextView ratingListAromaView =
                (TextView) view.findViewById(R.id.ratingAromaTV);
        TextView ratingListBodyView =
                (TextView) view.findViewById(R.id.ratingBodyTV);
        TextView ratingListTasteView =
                (TextView) view.findViewById(R.id.ratingTasteTV);
        TextView ratingListFinishView =
                (TextView) view.findViewById(R.id.ratingFinishTV);
        TextView ratingListTotalView =
                (TextView) view.findViewById(R.id.ratingTotalTV);
        TextView ratingListNotesView =
                (TextView) view.findViewById(R.id.ratingNotesTV);

        ratingListLinearLayout.setTag(selectedWine);
        String flightDesig = String.valueOf(selectedWine.getFlight());
        if (selectedWine.getOrder() == 1)
            flightDesig = flightDesig + "A";
        else
            flightDesig = flightDesig + "B";

        ratingListFlightView.setText(flightDesig);

        return view;
    }
}
