package com.example.aut2_03aplicacinfinalandroid.MusicLogic;

import java.io.Serializable;

public class AudioModel implements Serializable {
    String path;
    String title;
    String duration;
    Boolean favorite;

    public AudioModel(String path, String title, String duration) {
        this.path = path;
        this.title = title;
        this.duration = duration;
        this.favorite = false;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

}
