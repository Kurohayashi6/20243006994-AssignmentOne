package com.example.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * MainActivity serves as the main navigation portal of the CampusLife companion app.
 * It provides responsive buttons for the four student service areas:
 * Facilities, Events, Clubs, and Support.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Helper method to create and launch an explicit Intent targeting DetailActivity,
     * attaching the unique topic index as extra data.
     *
     * @param index The integer index representing the selected service area (0 to 3).
     */
    private void startDetailActivity(int index) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("TOPIC_INDEX", index);
        startActivity(intent);
    }

    /**
     * OnClick callback for the Facilities ImageButton.
     *
     * @param view The clicked view.
     */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity(0);
    }

    /**
     * OnClick callback for the Events ImageButton.
     *
     * @param view The clicked view.
     */
    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity(1);
    }

    /**
     * OnClick callback for the Clubs ImageButton.
     *
     * @param view The clicked view.
     */
    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity(2);
    }

    /**
     * OnClick callback for the Support ImageButton.
     *
     * @param view The clicked view.
     */
    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
        startDetailActivity(3);
    }
}