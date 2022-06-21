package com.example.medina.crudexample.service;

import com.example.medina.crudexample.dao.VehicleDao;
import com.example.medina.crudexample.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class VehicleService {

    private final VehicleDao VehicleDao;

    @Autowired
    public VehicleService(@Qualifier("fakeDao") VehicleDao VehicleDao) {
        this.VehicleDao = VehicleDao;
    }

    public int addVehicle(Vehicle vehicle) {
        return VehicleDao.addVehicle(vehicle);
    }

    public List<Vehicle> getAllProducts(){
        return VehicleDao.selectAllVehicles();
    }

    public Optional<Vehicle> getVehicleById(UUID uuid){
        //this might cause issues investigate further
        return Optional.ofNullable(VehicleDao.selectVehicleById(uuid)
                .orElse(null));
    }

    public int updateVehicleById(UUID uuid, Vehicle vehicle){
        VehicleDao.updateVehicleById(uuid,vehicle);
        return 1;
    }
    public int removeProductByID(UUID uuid){
        VehicleDao.deleteVehicleById(uuid);
        return 1;
    }


}
