package com.example.uts_mobile1_haris_rachman;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] titles;
    private final String[] contents;
    private final Integer[] images;

    public NewsAdapter(Activity context, String[] titles, String[] contents, Integer[] images) {
        super(context, R.layout.portal_news_activity, titles);
        this.context = context;
        this.titles = titles;
        this.contents = contents;
        this.images = images;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.news_item, null, true);

        TextView titleText = rowView.findViewById(R.id.textViewTitle);
        TextView contentText = rowView.findViewById(R.id.textViewContent);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        titleText.setText(titles[position]);
        contentText.setText(contents[position]);
        imageView.setImageResource(images[position]);

        return rowView;
    }
}

