package ardi.springintro.controller;

import ardi.springintro.model.Film;
import ardi.springintro.service.MovieProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class MoviesController {

  @Autowired
  private MovieProvider starwarsMovie;

  @GetMapping("/movies")
  public List<Film> getMovies() {
    List<Film> films = starwarsMovie.getMovies();

    return films;
  }

  @GetMapping("/movies/{index}")
  public Film getMovie(@PathVariable(name = "index") int urutan) {
    Film film = starwarsMovie.getMovie(urutan);

    return film;
  }

  @PostMapping("/movies")
  public boolean saveMovies(@RequestBody Film film) {
    boolean status = starwarsMovie.saveMovie(film);

    return status;
  }

  @DeleteMapping("/movies")
  public boolean deleteMovies() {
    boolean status = starwarsMovie.deleteMovie();

    return status;
  }

  @GetMapping("/movies-episode")
  public Film getMovieEpisode(@RequestParam(name = "episode") int index) {
    Film film = starwarsMovie.getMovies().get(index-1);

    return film;
  }

}
