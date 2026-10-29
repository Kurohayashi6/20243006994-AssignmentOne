package com.example.assignmentone;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * DetailActivity is responsible for displaying detailed information regarding
 * the selected campus topic (Facilities, Events, Clubs, or Support).
 * It dynamically populates the UI using resource arrays and identifiers without
 * using any conditional branching (if statements or switch cases).
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Retrieve the unique topic index passed from MainActivity via the explicit Intent
        Intent intent = getIntent();
        int topicIndex = intent.getIntExtra("TOPIC_INDEX", 0);

        // Access application resources
        Resources res = getResources();

        // Load string and drawable resource arrays defined in arrays.xml
        String[] titles = res.getStringArray(R.array.string_array_titles);
        String[] contents = res.getStringArray(R.array.string_array_content);
        String[] images = res.getStringArray(R.array.string_array_images);

        // Header titles corresponding to the 4 service areas
        String[] headers = {"Facilities", "Events", "Clubs", "Support"};

        // Bind layout views from activity_detail.xml
        ImageView ivIcon = findViewById(R.id.iv_detail_icon);
        TextView tvHeader = findViewById(R.id.tv_detail_header);
        TextView tvTitle = findViewById(R.id.tv_detail_title);
        TextView tvContent = findViewById(R.id.tv_detail_content);

        // Populate text views directly using the received array index
        tvHeader.setText(headers[topicIndex]);
        tvTitle.setText(titles[topicIndex]);
        tvContent.setText(contents[topicIndex]);

        // Dynamically resolve the drawable resource ID from the image filename string
        int imageResId = res.getIdentifier(images[topicIndex], "drawable", getPackageName());
        ivIcon.setImageResource(imageResId);
    }
}