package com.example.android.musicalapp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class DetailedSongActivity extends AppCompatActivity {

    private Song song;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_song);

        // set up button in actionbat
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView title = (TextView) findViewById(R.id.title);
        TextView lirics = (TextView) findViewById(R.id.lirics);

        song = (Song) getIntent().getSerializableExtra("song");
        type = getIntent().getStringExtra("mCategory");

        // set title in actionbar
        getSupportActionBar().setTitle(song.getTitle());

        title.setText(song.getTitle());
        lirics.setText(song.getLirics());
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {

        int itemId = menuItem.getItemId();
        if (itemId == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
