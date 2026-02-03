package com.example.projetospring.resources;

import com.example.projetospring.entities.Product;
import com.example.projetospring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/Products")
public class ProductResource {

    @Autowired
    private ProductService ProductService;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = ProductService.findAll();

        return ResponseEntity.ok().body(list);
    }

   /* @GetMapping
    public Product findById(Long id) {
        Optional<Product> Product = Optional.ofNullable(ProductService.findById(id));

        //sugestão da Ide se tem o valor retorna se não coloca null
        //return Product.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        return Product.get();
    }*/

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findbyId(@PathVariable Long id){
        Product Product = ProductService.findById(id);
        return ResponseEntity.ok().body(Product);
    }
}
