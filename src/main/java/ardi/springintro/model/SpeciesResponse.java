package ardi.springintro.model;

public class SpeciesResponse {
    String name;
    String classification;
    String designation;

    public SpeciesResponse() {
    }

    public SpeciesResponse(String name, String classification, String designation) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
