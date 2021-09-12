package ardi.springintro.service;

import ardi.springintro.model.*;

import java.util.List;

public interface SwapiClient {
  List<FilmResponse> getFilms();

  FilmResponse getFilms(int idx);

  List<PeopleResponse> getPeople();

  PeopleResponse getPeople(int idx);

  List<PlanetResponse> getPlanets();

  PlanetResponse getPlanet(int idx);

  List<SpeciesResponse> getSpecies();

  SpeciesResponse getSpecies(int idx);

  List<StarshipResponse> getStarships();

  StarshipResponse getStarship(int idx);

  List<VehicleResponse> getVehicles();

  VehicleResponse getVehicle(int idx);

}
