package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ShoppingCart {

    public Map<String, Integer> basketMap;
    private ProductRepository productRepository;

    public ShoppingCart() {
        this.basketMap = new HashMap<>();
        this.productRepository = new ProductRepository();
    }

    public void addProduct(String name, Integer ilosc) {

        if (basketMap.isEmpty()) {
            basketMap.put(name, ilosc);

        } else {
            if (isItem(name, ilosc)) {
                basketMap.put(name, ilosc + basketMap.get(name));
            } else {
                basketMap.put(name, ilosc);
            }
        }
    }

    public boolean isItem(String name, Integer ilosc) {
        for (Map.Entry<String, Integer> entry : basketMap.entrySet()) {
            if (entry.getKey().equals(name)) {
                return true;
            }
        }
        return false;


    }


    @Override
    public String toString() {
        return basketMap + "<br/><br/><a href=\"/\">Kontynuuj zakupy</a><br/>";
    }

    public double sumProduct() {
        double sum = 0;
        for (Map.Entry<String, Integer> entry : basketMap.entrySet()) {
            sum += entry.getValue() * productRepository.getPriceProductName(entry.getKey());
        }
        return sum;
    }
}

