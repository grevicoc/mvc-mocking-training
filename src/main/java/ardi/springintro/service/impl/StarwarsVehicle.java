package ardi.springintro.service.impl;

import ardi.springintro.model.Starship;
import ardi.springintro.model.StarshipResponse;
import ardi.springintro.model.Vehicle;
import ardi.springintro.model.VehicleResponse;
import ardi.springintro.service.StarshipsProvider;
import ardi.springintro.service.SwapiClient;
import ardi.springintro.service.VehiclesProvider;

import java.util.ArrayList;
import java.util.List;

public class StarwarsVehicle implements VehiclesProvider {
    List<Vehicle> vehicles = new ArrayList<>();
    /*
     *  return daftar Vehicle starwars
     *
     * */

    SwapiClient swapiClient;

    public StarwarsVehicle(SwapiClient swapiClient) {
        this.swapiClient = swapiClient;
    }

    @Override
    public List<Vehicle> getVehicles() {
        List<VehicleResponse> vehicleResponses = swapiClient.getVehicles();
        List<Vehicle> response = new ArrayList<>();

        for (VehicleResponse vehicleResponse : vehicleResponses) {
            response.add(new Vehicle(vehicleResponse.getName(), vehicleResponse.getModel(), vehicleResponse.getManufacturer()));
        }

        return response;
    }

    @Override
    public Vehicle getVehicle(int index) {
        VehicleResponse vehicleResponse = swapiClient.getVehicle(index);

        return new Vehicle(vehicleResponse.getName(), vehicleResponse.getModel(), vehicleResponse.getManufacturer());
    }
}
