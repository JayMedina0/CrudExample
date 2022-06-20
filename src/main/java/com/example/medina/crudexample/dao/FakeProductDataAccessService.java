package com.example.medina.crudexample.dao;

import com.example.medina.crudexample.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeProductDataAccessService implements ProductDao {

    private static List<Product> DB = new ArrayList<>();


    @Override
    public int addProduct(UUID id, Product product) {
        DB.add(new Product(id, product.getFirstName(), product.getLastName()));
        return 1;
    }

    @Override
    public List<Product> selectAllProducts() {
        return DB;
    }

    @Override
    public Optional<Product> selectProductById(UUID uuid) {
      return  DB.stream()
                .filter(product -> product.getId().equals(uuid))
                .findFirst();

    }


    @Override
    public int deleteProductById(UUID uuid) {
         DB.stream()
                .filter(product -> product.getId().equals(uuid))
                .findFirst();
        return 1;
    }

    @Override
    public int updateProductById(UUID id, Product product) {
        int five =5;
        if (five ==5){

        }
        return 1;
    }
}
