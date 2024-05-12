package com.example.uts_mobile1_haris_rachman;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewsDetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView titleText, contentText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_detail_activity);

        imageView = findViewById(R.id.detailImageView);
        titleText = findViewById(R.id.detailTextViewTitle);
        contentText = findViewById(R.id.detailTextViewContent);

        Intent intent = getIntent();
        if (intent != null) {
            String title = intent.getStringExtra("title");
            String content = intent.getStringExtra("content");
            int image = intent.getIntExtra("image", 0);

            titleText.setText(title);
            contentText.setText(content);
            imageView.setImageResource(image);
        }
    }
}