package ardi.springintro.service.impl;

import ardi.springintro.model.People;
import ardi.springintro.model.PeopleResponse;
import ardi.springintro.service.PeopleProvider;
import ardi.springintro.service.SwapiClient;

import java.util.ArrayList;
import java.util.List;

public class StarwarsPeople implements PeopleProvider {
    List<People> people = new ArrayList<>();
    /*
     *  return daftar people starwars
     *
     * */

    SwapiClient swapiClient;

    public StarwarsPeople(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<People> getPeople() {
        List<PeopleResponse> peopleResponses = swapiClient.getPeople();
        List<People> response = new ArrayList<>();

        for (PeopleResponse peopleResponse : peopleResponses) {
            People people = new People(peopleResponse.getName(), peopleResponse.getHeight(), peopleResponse.getMass());
            response.add(people);
        }

        return response;
    }

    @Override
    public People getPeople(int index) {
        PeopleResponse peopleResponse = swapiClient.getPeople(index);

        return new People(peopleResponse.getName(), peopleResponse.getHeight(), peopleResponse.getMass());
    }
}
