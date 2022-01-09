package ru.mtusi.sampleapi.service;

import ru.mtusi.sampleapi.model.Product;

import java.util.List;


public interface ProductService {
    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);

}
