package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository {

    private List<Product> productList;

    public ProductRepository(){
        productList=new ArrayList<>();
        productList.add(new Product("Gitara","Gibson",1234321,2499.99));
        productList.add(new Product("Perkusja","DW",1234322,14899.99));
        productList.add(new Product("Gitara","Epiphone",1234323,1499.99));
        productList.add(new Product("Gitara","Takamine",1234323,999.99));
        productList.add(new Product("Perkusja","Ludwig",1234321,25499.99));

    }

    public List<Product> getProductList() {
        return productList;
    }
}
