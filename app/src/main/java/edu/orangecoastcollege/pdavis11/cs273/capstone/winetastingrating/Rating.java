package edu.orangecoastcollege.pdavis11.cs273.capstone.winetastingrating;

/**
 * Created by jimburk on 11/10/17.
 */

public class Rating {
    private long mId;
    private int mFlight;
    private int mOrder;
    private float mColor;
    private float mAroma;
    private float mBody;
    private float mTaste;
    private float mFinish;
    private float mTotal;
    private String mNotes;

    public Rating(long id, int flight, int order, float color, float aroma, float body, float taste, float finish, float total, String notes) {
        mId = id;
        mFlight = flight;
        mOrder = order;
        mColor = color;
        mAroma = aroma;
        mBody = body;
        mTaste = taste;
        mFinish = finish;
        mTotal = total;
        mNotes = notes;
    }

    public Rating(int flight, int order) {
        this(-1, flight, order, -1, -1, -1, -1, -1, -1, "");
    }

    public long getId() {
        return mId;
    }

    public int getFlight() {
        return mFlight;
    }

    public int getOrder() {
        return mOrder;
    }

    public float getColor() {
        return mColor;
    }

    public float getAroma() {
        return mAroma;
    }

    public float getBody() {
        return mBody;
    }

    public float getTaste() {
        return mTaste;
    }

    public float getFinish() {
        return mFinish;
    }

    public float getTotal() {
        return mTotal;
    }

    public String getNotes() {
        return mNotes;
    }

    public void setId(long id) {
        mId = id;
    }

    public void setFlight(int flight) {
        mFlight = flight;
    }

    public void setOrder(int order) {
        mOrder = order;
    }

    public void setColor(float color) {
        mColor = color;
    }

    public void setAroma(float aroma) {
        mAroma = aroma;
    }

    public void setBody(float body) {
        mBody = body;
    }

    public void setTaste(float taste) {
        mTaste = taste;
    }

    public void setFinish(float finish) {
        mFinish = finish;
    }

    public void setTotal(float total) {
        mTotal = total;
    }

    public void setNotes(String notes) {
        mNotes = notes;
    }
}
