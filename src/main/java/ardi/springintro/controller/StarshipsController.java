package ardi.springintro.controller;

import ardi.springintro.model.Starship;
import ardi.springintro.service.StarshipsProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class StarshipsController {

  @Autowired
  private StarshipsProvider starwarsStarship;

  @GetMapping("/starships")
  public List<Starship> getStarships() {
    List<Starship> starships = starwarsStarship.getStarships();

    return starships;
  }

  @GetMapping("/starships/{index}")
  public Starship getStarship(@PathVariable(name = "index") int urutan) {
    Starship starship = starwarsStarship.getStarship(urutan);

    return starship;
  }

}
