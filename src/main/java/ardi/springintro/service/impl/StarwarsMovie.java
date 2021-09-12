package ardi.springintro.service.impl;

import ardi.springintro.model.Film;
import ardi.springintro.model.FilmResponse;
import ardi.springintro.service.MovieProvider;
import ardi.springintro.service.SwapiClient;

import java.util.ArrayList;
import java.util.List;

public class StarwarsMovie implements MovieProvider {

    List<Film> films = new ArrayList<>();
    /*
    *  return daftar movie starwars
    *
    * */

    SwapiClient swapiClient;

    public StarwarsMovie(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<Film> getMovies(){
        List<FilmResponse> filmResponses = swapiClient.getFilms();
        List<Film> response = new ArrayList<>();

        for (FilmResponse filmResponse : filmResponses) {
            Film film = new Film();
            film.setEpisode(filmResponse.getEpisode_id());
            film.setJudul(filmResponse.getTitle());

            response.add(film);
        }

        return response;
    }

    @Override
    public Film getMovie(int index) {
        FilmResponse filmResponse = swapiClient.getFilms(index);
        Film response = new Film(filmResponse.getTitle(), filmResponse.getEpisode_id());

        return response;
    }

    @Override
    public boolean saveMovie(Film film) {
        films.add(film);
        return true;
    }

    @Override
    public boolean deleteMovie() {
        films.clear();
        return true;
    }
}
