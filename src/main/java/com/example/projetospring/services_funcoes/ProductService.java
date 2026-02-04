package com.example.projetospring.services_funcoes;

import com.example.projetospring.entities.Product;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories_acesso_banco.ProductRepository;
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


