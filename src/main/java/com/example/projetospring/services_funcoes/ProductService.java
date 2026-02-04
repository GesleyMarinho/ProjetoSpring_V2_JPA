package com.example.projetospring.services;

import com.example.projetospring.entities.Product;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository ProductRepository;


    public List<Product> findAll() {
        return ProductRepository.findAll();
    }

    public Product findById(Long id) {
        return ProductRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

}


