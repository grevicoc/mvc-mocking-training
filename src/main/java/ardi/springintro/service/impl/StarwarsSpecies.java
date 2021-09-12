package ardi.springintro.service.impl;

import ardi.springintro.model.Species;
import ardi.springintro.model.SpeciesResponse;
import ardi.springintro.model.Species;
import ardi.springintro.service.SpeciesProvider;
import ardi.springintro.service.SpeciesProvider;
import ardi.springintro.service.SwapiClient;

import java.util.ArrayList;
import java.util.List;

public class StarwarsSpecies implements SpeciesProvider {
    List<Species> planets = new ArrayList<>();
    /*
     *  return daftar people starwars
     *
     * */

    SwapiClient swapiClient;

    public StarwarsSpecies(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<Species> getSpecies() {
        List<SpeciesResponse> speciesReponses = swapiClient.getSpecies();
        List<Species> response = new ArrayList<>();

        for (SpeciesResponse speciesReponse : speciesReponses) {
            response.add(new Species(speciesReponse.getName(), speciesReponse.getClassification(), speciesReponse.getDesignation()));
        }

        return response;
    }

    @Override
    public Species getSpecies(int index) {
        SpeciesResponse speciesReponse = swapiClient.getSpecies(index);

        return new Species(speciesReponse.getName(), speciesReponse.getClassification(), speciesReponse.getDesignation());
    }
}
