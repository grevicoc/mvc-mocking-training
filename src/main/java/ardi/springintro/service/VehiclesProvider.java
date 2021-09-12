package ardi.springintro.service;

import ardi.springintro.model.Starship;
import ardi.springintro.model.Vehicle;

import java.util.List;

public interface VehiclesProvider {

    public List<Vehicle> getVehicles();

    public Vehicle getVehicle(int index);

}
