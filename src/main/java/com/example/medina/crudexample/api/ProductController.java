package com.example.medina.crudexample.api;

import com.example.medina.crudexample.model.Product;
import com.example.medina.crudexample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequestMapping("api/v1/Product")
@RestController
public class ProductController {


    private final ProductService ProductService;

    @Autowired
    public ProductController(ProductService ProductService) {
        this.ProductService = ProductService;
    }
    @PostMapping
    public void addProduct(@RequestBody Product product) {
        ProductService.addProduct(product);
    }
    @GetMapping
    public List getAllPeople(@RequestBody Product product) {
        return ProductService.getAllProducts();
    }
    @GetMapping("{uuid}")
    public Optional<Product> getProductById(@PathVariable("uuid") UUID uuid){
        return (ProductService.getProductById(uuid));
    }
   // @PutMapping("{uuid}")


}
