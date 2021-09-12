package ardi.springintro.model;

import java.util.List;

public class SwapiResponse<T> {
  List<T> results;

  public SwapiResponse() {
  }

  public SwapiResponse(List<T> results) {
    this.results = results;
  }

  public List<T> getResults() {
    return results;
  }

  public void setResults(List<T> results) {
    this.results = results;
  }
}
