package com.example.aut2_03aplicacinfinalandroid.MusicLogic;

import android.media.MediaPlayer;

public class SongReproducer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance(){
        if(instance == null){
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;
}
