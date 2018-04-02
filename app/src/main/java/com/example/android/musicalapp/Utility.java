package com.example.android.musicalapp;

import java.util.ArrayList;
import java.util.HashMap;

public class Utility {

    public static ArrayList<Song> getSongs(String type) {

        HashMap<String, ArrayList<Song>> songs = new HashMap<String, ArrayList<Song>>();
        // bedtime songs
        ArrayList<Song> bedtimeSongs = new ArrayList<Song>();
        bedtimeSongs.add(new Song("Twinkle, twinkle, little star", "Twinkle, twinkle, little star," +
                "\nHow I wonder what you are!" +
                "\nUp above the world so high," +
                "\nLike a diamond in the sky!"));
        bedtimeSongs.add(new Song("You Are My Sunshine", "You are my sunshine, my only sunshine" +
                "\nYou make me happy when skies are gray" +
                "\nYou'll never know dear, how much I love you" +
                "\nPlease don't take my sunshine away" +
                "\n\nI'll always love you and make you happy" +
                "\nIf you will only say the same" +
                "\nBut if you leave me and love another" +
                "\nYou'll regret it all some day."));
        bedtimeSongs.add(new Song("Amazing Grace", "Amazing grace! How sweet the sound" +
                "\nThat saved a wretch like me!" +
                "\nI once was lost but now am found" +
                "\nWas blind, but now I see."));
        bedtimeSongs.add(new Song("Hush Little Baby", "Hush, little baby, don't say a word," +
                "\n(Mama's/Papa's) gonna buy you a mockingbird." +
                "\nAnd if that mockingbird won't sing," +
                "\n(Mama's/Papa's) gonna buy you a diamond ring."));
        bedtimeSongs.add(new Song("The Alphabet Song", "A-B-C-D-E-F-G," +
                "\nH-I-J-K-L-M-N-O-P," +
                "\nQ-R-S-T-U-V-W-X-Y and Z." +
                "\nNow I know my A-B-Cs," +
                "\nNext time won't you sing with me."));
        songs.put("bedtime", bedtimeSongs);

        // playing songs
        ArrayList<Song> playingSongs = new ArrayList<Song>();
        playingSongs.add(new Song("Baby Bumble Bee Song", "I’m bringing home a baby bumblebee,\n" +
                "I’m bringing home a baby bumblebee,\n" +
                "I’m bringing home a baby bumblebee,\n" +
                "Won’t my Mummy be so proud of me?\n" +
                "I’m bringing home a baby bumblebee,\n" +
                "(spoken) Ouch! He stung me!\n" +
                "I’m squishing up a baby bumblebee,\n" +
                "Wont my Mummy be so proud of me?\n" +
                "I’m squishing up my baby bumblebee,\n" +
                "(spoken) Eew! It’s all over me!\n" +
                "I’m wiping off a baby bumblebee,\n" +
                "Wont my Mummy be so proud of me?\n" +
                "I’m wiping off a baby bumblebee,\n" +
                "(spoken) Look! All clean!"));
        playingSongs.add(new Song("Splashing in the Puddles", "Splashing in the puddles, \n" +
                "Splashing in the puddles, \n" +
                "Splashing in the puddles, \n" +
                "But don’t let Mummy see!  \n" +
                "\n" +
                "Walking through the raindrops, \n" +
                "Walking through the raindrops, \n" +
                "Walking through the raindrops,\n" +
                "Let’s hope we don’t get wet!\n" +
                "\n" +
                "Stamping in the gutters,\n" +
                "Stamping in the gutters,\n" +
                "Stamping in the gutters,\n" +
                "But don’t let Mummy see!"));
        playingSongs.add(new Song("I Sent a Letter to My Love", "A tisket, a tasket,\n" +
                "A green and yellow basket,\n" +
                "I sent a letter to my love,\n" +
                "And on the way I dropped it,\n" +
                "I dropped, I dropped it,\n" +
                "And on the way I dropped it,\n" +
                "A little boy picked it up,\n" +
                "And put it in his pocket."));
        songs.put("playing", playingSongs);

        // learning songs
        ArrayList<Song> learningSongs = new ArrayList<Song>();
        learningSongs.add(new Song("The color song", "My colour’s cool and pure," +
                "\nLike sky or water," +
                "\nGuess what you think it is?" +
                "\n(child answers) “I think it’s blue!”" +
                "\n\nMy colour’s clean and fresh," +
                "\nLike a cucumber," +
                "\nGuess what you think it is?" +
                "\n(child answers) “I think it’s green!”" +
                "\n\nMy colour’s warm and hot," +
                "\nJust like a chilli," +
                "\nGuess what you think it is?" +
                "\n(child answers) “I think it’s red!”"));
        learningSongs.add(new Song("Treasure! A musical Game", "Who has the conker?\n" +
                "“I have the conker”\n" +
                "Who has the key?\n" +
                "“I have the key”\n" +
                "Who has the monster?\n" +
                "“I have the monster”\n" +
                "Please let us see!"));
        learningSongs.add(new Song("How are you feeling today", "How are you feeling today?\n" +
                "Oh how are you feeling today?\n" +
                "I’m happy and glad, happy and glad,\n" +
                "That’s how I’m feeling today.\n" +
                "\n" +
                "How are you feeling today?\n" +
                "Oh how are you feeling today?\n" +
                "I’m grumpy and cross, grumpy and cross,\n" +
                "That’s how I’m feeling today."));
        learningSongs.add(new Song("5 little monkeys jumping on the bed", "Five little monkeys jumping on the bed,\n" +
                "One fell off and bumped his head! \n" +
                "Mummy phoned the Doctor, and the Doctor said.. \n" +
                "“No more monkeys jumping on the bed!\""));
        songs.put("learning", learningSongs);

        // travel songs
        ArrayList<Song> travelSongs = new ArrayList<Song>();
        travelSongs.add(new Song("The wheels on the bus", "The wheels on the bus go round and round,\n" +
                "round and round, round and round.\n" +
                "The wheels on the bus go round and round,\n" +
                "A-ll  da-y  lo-ng!\n" +
                "\n" +
                "The wipers on the bus go swish, swish, swish etc.\n" +
                "The doors on the bus go open and shut, open and shut etc.\n" +
                "The horn on the bus goes beep, beep, beep etc.\n" +
                "The children on the bus go chatter, chatter, chatter etc.\n" +
                "The people on the bus bounce up and down, up and down etc.\n" +
                "The babies on the bus go fast asleep, fast asleep, fast asleep etc."));
        travelSongs.add(new Song("Down at the station", "Down at the station early in the morning,\n" +
                "See the little puffa trains all in a row,\n" +
                "See the engine driver turn the little handle,\n" +
                "Puff, puff, chuff, chuff, off we go!"));
        travelSongs.add(new Song("Row Row Row Your Boat", "Row row row your boat,\n" +
                "Gently down the stream,\n" +
                "Merrily, merrily, merrily, merrily,\n" +
                "Life is but a dream!\n" +
                "\n" +
                "Row row row your boat,\n" +
                "Gently down the stream,\n" +
                "If you see a crocodile,\n" +
                "Don’t forget to scream!\n" +
                "\n" +
                "Row row row your boat,\n" +
                "Gently to the shore,\n" +
                "If you see a dinosaur,\n" +
                "Don’t forget to roar!!"));
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
