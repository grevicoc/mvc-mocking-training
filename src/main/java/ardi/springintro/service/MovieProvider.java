package ardi.springintro.service;

import ardi.springintro.model.Film;

import java.util.List;

public interface MovieProvider {

    public List<Film> getMovies();

    public Film getMovie(int index);

    public boolean saveMovie(Film film);

    public boolean deleteMovie();

}
