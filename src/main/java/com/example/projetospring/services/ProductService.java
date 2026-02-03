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

    /*@GetMapping
    public Product findById(Long id) {
        Optional<Product> Product = ProductRepository.findById(id);

        //sugestão da Ide se tem o valor retorna se não coloca null
        return Product.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        //return Product.get();
    }*/

   /* @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findbyId(@PathVariable Long id){
        Product Product = ProductRepository.findById(id).get();
        return ResponseEntity.ok().body(Product);
    }*/
}


