package com.example.medina.crudexample.dao;

import com.example.medina.crudexample.model.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VehicleDao {

    int addVehicle(UUID id, Vehicle vehicle);

    default int addVehicle(Vehicle vehicle) {
        UUID id = UUID.randomUUID();
        return addVehicle(id, vehicle);
    }

    List<Vehicle> selectAllVehicles();

    Optional<Vehicle> selectVehicleById(UUID uuid);

    int deleteVehicleById(UUID uuid);

    int updateVehicleById(UUID id, Vehicle vehicle);

}
