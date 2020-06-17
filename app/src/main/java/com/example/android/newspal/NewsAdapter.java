package com.example.android.newspal;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }


        News currentNews = getItem(position);

        // Find the TextView with view ID title
        TextView TitleView = (TextView) listItemView.findViewById(R.id.title);
        String title = currentNews.getmTitle();
        TitleView.setText(title);

        // Find the TextView with view ID headline
        TextView HeadlineView = (TextView) listItemView.findViewById(R.id.headline);
        String headline = currentNews.getmHeadline();
        HeadlineView.setText(headline);


        // Find the TextView with view ID date
        TextView DateView = (TextView) listItemView.findViewById(R.id.date);
        String formatDate = currentNews.getmDate();
        DateView.setText(formatDate);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.banner);


        return listItemView;
    }

    private String formatDate(Date dateObj) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(dateObj);
    }



}

