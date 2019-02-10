package com.rds.andjaradji.moviesrv;

/**
 * Created by Anjar on 21/02/2018.
 */

public class Movies {
    private String title, genre, year;

    public Movies(String title, String genre, String year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
