package com.example.medina.crudexample.dao;

import com.example.medina.crudexample.model.Vehicle;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class VehicleDataAccessService implements VehicleDao {

    //TODO Database connections
    //TODO JPA

    private static List<Vehicle> DB = new ArrayList<>();


    @Override
    public int addVehicle(UUID id, Vehicle vehicle) {
        DB.add(new Vehicle(id, vehicle.getFirstName(), vehicle.getLastName()));
        return 1;
    }

    @Override
    public List<Vehicle> selectAllVehicles() {
        return DB;
    }

    @Override
    public Optional<Vehicle> selectVehicleById(UUID uuid) {
      return  DB.stream()
                .filter(vehicle -> vehicle.getId().equals(uuid))
                .findFirst();
    }


    @Override
    public int deleteVehicleById(UUID uuid) {
         DB.stream()
                .filter(vehicle -> vehicle.getId().equals(uuid))
                .findFirst();
        return 1;
    }

    @Override
    public int updateVehicleById(UUID id, Vehicle vehicle) {

        return 1;
    }
}
