package com.example.medina.crudexample.service;

import com.example.medina.crudexample.dao.ProductDao;
import com.example.medina.crudexample.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService {

    private final ProductDao ProductDao;

    @Autowired
    public ProductService(@Qualifier("fakeDao") ProductDao ProductDao) {
        this.ProductDao = ProductDao;
    }

    public int addProduct(Product product) {
        return ProductDao.addProduct(product);
    }

    public List<Product> getAllProducts(){
        return ProductDao.selectAllProducts();
    }

    public Optional<Product> getProductById(UUID uuid){
       return ProductDao.selectProductById(uuid);
    }

//    public int replaceProductById(UUID uuid, Product product){
//
//        ProductDao.updateProductById(UUID,
//        return 1;
//    }
    public int removeProductByID(UUID uuid){
        ProductDao.deleteProductById(uuid);
        return 1;
    }


}
