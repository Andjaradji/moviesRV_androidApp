package com.rds.andjaradji.moviesrv;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anjar on 21/02/2018.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    private List<Movies> moviesList;

    public MovieAdapter(List<Movies> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MovieAdapter.MovieHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row,parent,false);

        return new MovieHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MovieHolder holder, int position) {
        Movies movies = moviesList.get(position);
        holder.title.setText(movies.getTitle());
        holder.genre.setText(movies.getGenre());
        holder.year.setText(movies.getYear());

    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {
        public TextView title,genre,year;
        public MovieHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleID);
            genre = itemView.findViewById(R.id.genreID);
            year  = itemView.findViewById(R.id.yearID);
        }
    }
}
