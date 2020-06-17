package com.example.android.newspal;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class HttpLoader extends AsyncTaskLoader<List<News>> {

    private static String REQUEST_URL =  "\n" +
            "\n" +
            "https://content.guardianapis.com/search?show-elements=image&show-fields=thumbnail&api-key=c441afd5-cc2a-4117-b0d6-97c3c8f18fe4";


    public HttpLoader(Context context) {
        super(context);

    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (REQUEST_URL == null) {
            return null;
        }

        List<News> newsList = QueryUtils.fetchNewsData(REQUEST_URL);
        return newsList;


    }
}
