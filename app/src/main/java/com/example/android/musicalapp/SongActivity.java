package com.example.android.musicalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Song> songs = new ArrayList<Song>();
    Category mCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        mCategory = (Category) getIntent().getSerializableExtra("mCategory");
        songs = Utility.getSongs(mCategory.getType());

        SongAdapter adapter = new SongAdapter(this, songs, mCategory);

        listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Song song = songs.get(position);
                Intent myIntent = new Intent(view.getContext(), DetailedSongActivity.class);
                myIntent.putExtra("song", song);
                myIntent.putExtra("mCategory", mCategory.getType());
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
