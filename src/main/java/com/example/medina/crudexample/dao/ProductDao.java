package com.example.medina.crudexample.dao;

import com.example.medina.crudexample.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductDao {

    int addProduct(UUID id, Product product);

    default int addProduct(Product product) {
        UUID id = UUID.randomUUID();
        return addProduct(id, product);
    }

    List<Product> selectAllProducts();

    Optional<Product> selectProductById(UUID uuid);

    int deleteProductById(UUID uuid);

    int updateProductById(UUID id, Product product);
}
