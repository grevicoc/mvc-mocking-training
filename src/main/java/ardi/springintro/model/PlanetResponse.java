package ardi.springintro.model;

public class PlanetResponse {
    String name;
    String rotation_period;
    String orbital_period;

    public PlanetResponse(String name, String rotation_period, String orbital_period) {
        this.name = name;
        this.rotation_period = rotation_period;
        this.orbital_period = orbital_period;
    }

    public PlanetResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }
}
