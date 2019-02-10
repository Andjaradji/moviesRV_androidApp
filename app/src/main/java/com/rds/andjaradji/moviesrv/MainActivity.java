package com.rds.andjaradji.moviesrv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movies> mMovieList = new ArrayList<>();
    private RecyclerView rv;
    private RecyclerView.Adapter mAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = findViewById(R.id.recycler_view);
        mAdapter = new MovieAdapter(mMovieList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setItemAnimator(new DefaultItemAnimator());
        rv.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movies movie = new Movies("Mad Max: Fury Road", "Action & Adventure", "2015");
        mMovieList.add(movie);

        movie = new Movies("Inside Out", "Animation, Kids & Family", "2015");
        mMovieList.add(movie);

        movie = new Movies("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        mMovieList.add(movie);

        movie = new Movies("Shaun the Sheep", "Animation", "2015");
        mMovieList.add(movie);

        movie = new Movies("The Martian", "Science Fiction & Fantasy", "2015");
        mMovieList.add(movie);

        movie = new Movies("Mission: Impossible Rogue Nation", "Action", "2015");
        mMovieList.add(movie);

        movie = new Movies("Up", "Animation", "2009");
        mMovieList.add(movie);

        movie = new Movies("Star Trek", "Science Fiction", "2009");
        mMovieList.add(movie);

        movie = new Movies("The LEGO Movie", "Animation", "2014");
        mMovieList.add(movie);

        movie = new Movies("Iron Man", "Action & Adventure", "2008");
        mMovieList.add(movie);

        movie = new Movies("Aliens", "Science Fiction", "1986");
        mMovieList.add(movie);

        movie = new Movies("Chicken Run", "Animation", "2000");
        mMovieList.add(movie);

        movie = new Movies("Back to the Future", "Science Fiction", "1985");
        mMovieList.add(movie);

        movie = new Movies("Raiders of the Lost Ark", "Action & Adventure", "1981");
        mMovieList.add(movie);

        movie = new Movies("Goldfinger", "Action & Adventure", "1965");
        mMovieList.add(movie);

        movie = new Movies("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        mMovieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
