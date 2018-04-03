package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Song> songs = new ArrayList<Song>();
    private Category mCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        //set Up button in actiobar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mCategory = (Category) getIntent().getSerializableExtra("mCategory");
        // set title in actiobar
        getSupportActionBar().setTitle(mCategory.getType().toUpperCase());

        songs = Utility.getSongs(this, mCategory.getType());

        SongAdapter adapter = new SongAdapter(this, songs, mCategory);

        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Song song = songs.get(position);
                Intent songIntent = new Intent(view.getContext(), DetailedSongActivity.class);
                songIntent.putExtra("song", song);
                songIntent.putExtra("mCategory", mCategory.getType());
                startActivityForResult(songIntent, 0);
            }
        });
    }
}
