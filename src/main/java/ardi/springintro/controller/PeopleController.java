package ardi.springintro.controller;

import ardi.springintro.model.People;
import ardi.springintro.service.PeopleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
public class PeopleController {

  @Autowired
  private PeopleProvider starwarsPeople;

  @GetMapping("/people")
  public List<People> getPeople() {
    List<People> people = starwarsPeople.getPeople();

    return people;
  }

  @GetMapping("/people/{index}")
  public People getPeople(@PathVariable(name = "index") int urutan) {
    People people = starwarsPeople.getPeople(urutan);

    return people;
  }

}
