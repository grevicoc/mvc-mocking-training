package ardi.springintro.service.impl;

import ardi.springintro.model.*;
import ardi.springintro.model.PlanetResponse;
import ardi.springintro.service.SwapiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
public class SwapiClientImpl implements SwapiClient {

  @Autowired
  @Qualifier("swapiWebClient")
  private WebClient swapiWebClient;

  /* FILM */
  @Override
  public List<FilmResponse> getFilms() {
    SwapiResponse<FilmResponse> response = swapiWebClient.get()
        .uri("/films")
        .retrieve()
        .bodyToMono(new ParameterizedTypeReference<SwapiResponse<FilmResponse>>() {})
        .block();
    return response.getResults();
  }

  @Override
  public FilmResponse getFilms(int idx) {
    FilmResponse response = swapiWebClient.get()
            .uri("/films/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<FilmResponse>() {})
            .block();

    return response;
  }

  /* PEOPLE */
  @Override
  public List<PeopleResponse> getPeople() {
    SwapiResponse<PeopleResponse> response = swapiWebClient.get()
            .uri("/people")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SwapiResponse<PeopleResponse>>() {})
            .block();
    return response.getResults();
  }

  @Override
  public PeopleResponse getPeople(int idx) {
    PeopleResponse response = swapiWebClient.get()
            .uri("/people/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<PeopleResponse>() {})
            .block();

    return response;
  }

  /* PLANET */
  @Override
  public List<PlanetResponse> getPlanets() {
    SwapiResponse<PlanetResponse> response = swapiWebClient.get()
            .uri("/planets")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SwapiResponse<PlanetResponse>>() {})
            .block();
    return response.getResults();
  }

  @Override
  public PlanetResponse getPlanet(int idx) {
    PlanetResponse response = swapiWebClient.get()
            .uri("/planets/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<PlanetResponse>() {})
            .block();

    return response;
  }

  /* SPECIES */
  @Override
  public List<SpeciesResponse> getSpecies() {
    SwapiResponse<SpeciesResponse> response = swapiWebClient.get()
            .uri("/species")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SwapiResponse<SpeciesResponse>>() {})
            .block();
    return response.getResults();
  }

  @Override
  public SpeciesResponse getSpecies(int idx) {
    SpeciesResponse response = swapiWebClient.get()
            .uri("/species/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SpeciesResponse>() {})
            .block();

    return response;
  }

  /* STARSHIP */
  @Override
  public List<StarshipResponse> getStarships() {
    SwapiResponse<StarshipResponse> response = swapiWebClient.get()
            .uri("/starships")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SwapiResponse<StarshipResponse>>() {})
            .block();
    return response.getResults();
  }

  @Override
  public StarshipResponse getStarship(int idx) {
    StarshipResponse response = swapiWebClient.get()
            .uri("/starships/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<StarshipResponse>() {})
            .block();

    return response;
  }

  /* VEHICLE */
  @Override
  public List<VehicleResponse> getVehicles() {
    SwapiResponse<VehicleResponse> response = swapiWebClient.get()
            .uri("/vehicles")
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<SwapiResponse<VehicleResponse>>() {})
            .block();
    return response.getResults();
  }

  @Override
  public VehicleResponse getVehicle(int idx) {
    VehicleResponse response = swapiWebClient.get()
            .uri("/vehicles/"+idx)
            .retrieve()
            .bodyToMono(new ParameterizedTypeReference<VehicleResponse>() {})
            .block();

    return response;
  }
}
