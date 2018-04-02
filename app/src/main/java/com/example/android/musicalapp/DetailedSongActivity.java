package com.example.android.musicalapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.TextView;

public class DetailedSongActivity extends AppCompatActivity {

    Song song;
    String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_song);

        TextView title = (TextView) findViewById(R.id.title);

        TextView lirics = (TextView) findViewById(R.id.lirics);

        song = (Song) getIntent().getSerializableExtra("song");
        type = getIntent().getStringExtra("mCategory");

        title.setText(song.getTitle());
        lirics.setText(song.getLirics());

        ImageButton play = (ImageButton) findViewById(R.id.play);

    }
}
