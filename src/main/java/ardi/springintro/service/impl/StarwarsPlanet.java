package ardi.springintro.service.impl;

import ardi.springintro.model.People;
import ardi.springintro.model.PlanetResponse;
import ardi.springintro.model.Planet;
import ardi.springintro.service.PeopleProvider;
import ardi.springintro.service.PlanetProvider;
import ardi.springintro.service.SwapiClient;

import java.util.ArrayList;
import java.util.List;

public class StarwarsPlanet implements PlanetProvider {
    List<Planet> planets = new ArrayList<>();
    /*
     *  return daftar people starwars
     *
     * */

    SwapiClient swapiClient;

    public StarwarsPlanet(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<Planet> getPlanets() {
        List<PlanetResponse> planetResponses = swapiClient.getPlanets();
        List<Planet> response = new ArrayList<>();

        for (PlanetResponse planetResponse : planetResponses) {
            response.add(new Planet(planetResponse.getName(), planetResponse.getRotation_period(), planetResponse.getOrbital_period()));
        }

        return response;
    }

    @Override
    public Planet getPlanet(int index) {
        PlanetResponse planetResponse = swapiClient.getPlanet(index);

        return new Planet(planetResponse.getName(), planetResponse.getRotation_period(), planetResponse.getOrbital_period());
    }
}
