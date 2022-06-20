package com.example.medina.crudexample.api;

import com.example.medina.crudexample.model.Vehicle;
import com.example.medina.crudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/Product")
@RestController
public class VehicleController {


    private final ProductService ProductService;

    @Autowired
    public VehicleController(ProductService ProductService) {
        this.ProductService = ProductService;
    }
    @PostMapping
    public void addProduct(@RequestBody Vehicle vehicle) {
        ProductService.addProduct(vehicle);
    }
    @GetMapping
    public List getAllPeople(@RequestBody Vehicle vehicle) {
        return ProductService.getAllProducts();
    }
    @GetMapping("{uuid}")
    public Optional<Vehicle> getProductById(@PathVariable("uuid") UUID uuid){
        return (ProductService.getProductById(uuid));
    }
   // @PutMapping("{uuid}")


}
