package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {

    private List<Product> productList = new ArrayList<>();

    public ProductRepository() {
        this.productList.add(new Product("Gitara", "Gibson", "https://e.allegroimg.com/s512/03c936/a2bf759544a49e987d32dad5049e", 1234321, 14499.99));
        productList.add(new Product("Perkusja", "DW", "https://drumshop.pl/9962-allegro_large/ludwig-perkusja-signet-105-giga-beat-shellset-indian-teak.jpg", 1234322, 14899.99));
        productList.add(new Product("Gitara", "Epiphone", "http://static.rnr.pl/products/1579/thumb-lg-554a327a1c4a5.jpg", 1234323, 1499.99));
        productList.add(new Product("Gitara", "Takamine", "https://riff.net.pl/7036-large_default/takamine-gn15ce-nat.jpg", 1234323, 999.99));
        productList.add(new Product("Perkusja", "Ludwig", "https://muzyczny.pl/towary/118319.jpg", 1234321, 25499.99));

    }

    public List<Product> getProductList() {
        return productList;
    }


    public double getPriceProductName(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product.getPrice();
            }
        }
        return 0;
    }
}
