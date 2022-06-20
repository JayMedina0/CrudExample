package com.example.medina.crudexample.api;

import com.example.medina.crudexample.model.Vehicle;
import com.example.medina.crudexample.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/Product")
@RestController
public class VehicleController {


    private final VehicleService VehicleService;

    @Autowired
    public VehicleController(VehicleService VehicleService) {
        this.VehicleService = VehicleService;
    }
    @PostMapping
    public void addProduct(@RequestBody Vehicle vehicle) {
        VehicleService.addVehicle(vehicle);
    }
    @GetMapping
    public List getAllPeople(@RequestBody Vehicle vehicle) {
        return VehicleService.getAllProducts();
    }
    @GetMapping("{uuid}")
    public Optional<Vehicle> getProductById(@PathVariable("uuid") UUID uuid){
        return (VehicleService.getProductById(uuid));
    }
   // @PutMapping("{uuid}") asdfasfdsafdsa


}
