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
public class ProductService {

    private final VehicleDao VehicleDao;

    @Autowired
    public ProductService(@Qualifier("fakeDao") VehicleDao VehicleDao) {
        this.VehicleDao = VehicleDao;
    }

    public int addProduct(Vehicle vehicle) {
        return VehicleDao.addProduct(vehicle);
    }

    public List<Vehicle> getAllProducts(){
        return VehicleDao.selectAllProducts();
    }

    public Optional<Vehicle> getProductById(UUID uuid){
       return VehicleDao.selectProductById(uuid);
    }

//    public int replaceProductById(UUID uuid, Product product){
//
//        ProductDao.updateProductById(UUID,
//        return 1;
//    }
    public int removeProductByID(UUID uuid){
        VehicleDao.deleteVehicleById(uuid);
        return 1;
    }


}
