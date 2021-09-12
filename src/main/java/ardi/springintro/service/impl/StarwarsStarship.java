package ardi.springintro.service.impl;

import ardi.springintro.model.Starship;
import ardi.springintro.model.StarshipResponse;
import ardi.springintro.service.StarshipsProvider;
import ardi.springintro.service.SwapiClient;

import java.util.ArrayList;
import java.util.List;

public class StarwarsStarship implements StarshipsProvider {
    List<Starship> starships = new ArrayList<>();
    /*
     *  return daftar starship starwars
     *
     * */

    SwapiClient swapiClient;

    public StarwarsStarship(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<Starship> getStarships() {
        List<StarshipResponse> starshipResponses = swapiClient.getStarships();
        List<Starship> response = new ArrayList<>();

        for (StarshipResponse starshipResponse : starshipResponses) {
            response.add(new Starship(starshipResponse.getName(), starshipResponse.getModel(), starshipResponse.getManufacturer()));
        }

        return response;
    }

    @Override
    public Starship getStarship(int index) {
        StarshipResponse starshipResponse = swapiClient.getStarship(index);

        return new Starship(starshipResponse.getName(), starshipResponse.getModel(), starshipResponse.getManufacturer());
    }
}
