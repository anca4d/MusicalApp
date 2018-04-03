package com.example.android.musicalapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;

public class Utility {

    public static ArrayList<Song> getSongs(Context context, String type) {

        HashMap<String, ArrayList<Song>> songs = new HashMap<String, ArrayList<Song>>();
        // bedtime songs
        ArrayList<Song> bedtimeSongs = new ArrayList<Song>();
        bedtimeSongs.add(new Song(context.getString(R.string.bedtimeTitle1), context.getString(R.string.bedtimeLirics1)));
        bedtimeSongs.add(new Song(context.getString(R.string.bedtimeTitle2), context.getString(R.string.bedtimeLirics2)));
        bedtimeSongs.add(new Song(context.getString(R.string.bedtimeTitle3), context.getString(R.string.bedtimeLirics3)));
        bedtimeSongs.add(new Song(context.getString(R.string.bedtimeTitle4), context.getString(R.string.bedtimeLirics4)));
        bedtimeSongs.add(new Song(context.getString(R.string.bedtimeTitle5), context.getString(R.string.bedtimeLirics5)));
        songs.put("bedtime", bedtimeSongs);

        // playing songs
        ArrayList<Song> playingSongs = new ArrayList<Song>();
        playingSongs.add(new Song(context.getString(R.string.playingTitle1), context.getString(R.string.playingLirics1)));
        playingSongs.add(new Song(context.getString(R.string.playingTitle2), context.getString(R.string.playingLirics2)));
        playingSongs.add(new Song(context.getString(R.string.playingTitle3), context.getString(R.string.playingLirics3)));
        songs.put("playing", playingSongs);

        // learning songs
        ArrayList<Song> learningSongs = new ArrayList<Song>();
        learningSongs.add(new Song(context.getString(R.string.learningTitle1), context.getString(R.string.learningLirics1)));
        learningSongs.add(new Song(context.getString(R.string.learningTitle2), context.getString(R.string.learningLirics2)));
        learningSongs.add(new Song(context.getString(R.string.learningTitle3), context.getString(R.string.learningLirics3)));
        learningSongs.add(new Song(context.getString(R.string.learningTitle4), context.getString(R.string.learningLirics4)));
        songs.put("learning", learningSongs);

        // travel songs
        ArrayList<Song> travelSongs = new ArrayList<Song>();
        travelSongs.add(new Song(context.getString(R.string.travelTitle1), context.getString(R.string.travelLirics1)));
        travelSongs.add(new Song(context.getString(R.string.travelTitle2), context.getString(R.string.travelLirics2)));
        travelSongs.add(new Song(context.getString(R.string.travelTitle3), context.getString(R.string.travelLirics3)));
        songs.put("travel", travelSongs);

        return songs.get(type);
    }

    public static ArrayList<Category> getTypes() {
        ArrayList<Category> categories = new ArrayList<Category>();
        categories.add(new Category(R.drawable.ic_travel, R.drawable.ic_right, "Travel Songs", "travel"));
        categories.add(new Category(R.drawable.ic_play, R.drawable.ic_right, "Playing Songs", "playing"));
        categories.add(new Category(R.drawable.ic_read, R.drawable.ic_right, "Learning Songs", "learning"));
        categories.add(new Category(R.drawable.ic_bedtime, R.drawable.ic_right, "Bedtime Songs", "bedtime"));

        return categories;
    }
}
