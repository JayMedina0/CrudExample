package com.example.medina.crudexample.dao;

import com.example.medina.crudexample.model.Vehicle;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface VehicleDao {

    int addProduct(UUID id, Vehicle vehicle);

    default int addProduct(Vehicle vehicle) {
        UUID id = UUID.randomUUID();
        return addProduct(id, vehicle);
    }

    List<Vehicle> selectAllProducts();

    Optional<Vehicle> selectProductById(UUID uuid);

    int deleteProductById(UUID uuid);

    int updateProductById(UUID id, Vehicle vehicle);
}
