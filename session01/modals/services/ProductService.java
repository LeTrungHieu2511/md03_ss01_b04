package com.example.session01.modals.services;

import com.example.session01.modals.entities.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {
        products.add(new Product(1, "Laptop", 15000000));
        products.add(new Product(2, "Chuột không dây", 250000));
        products.add(new Product(3, "Bàn phím cơ", 1200000));
    }

    public List<Product> getAllProducts() {
        return products;
    }
}
