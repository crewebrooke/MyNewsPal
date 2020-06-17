package com.example.android.newspal;

import android.graphics.Bitmap;


public class News {
    private String mTitle;
    private String mHeadline;
    private String mDate;
    private String mUrl;
    private Bitmap mImage;


    public News(String mTitle, String mHeadline, String mDate, String mUrl) {
        this.mTitle = mTitle;
        this.mHeadline = mHeadline;
        this.mDate = mDate;
        this.mUrl = mUrl;
        this.mImage = mImage;

    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmHeadline() {
        return mHeadline;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmUrl() {
        return mUrl;
    }

    public Bitmap getmImage (){
        return mImage;
    }


}

