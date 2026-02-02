package com.example.projetospring.services;

import com.example.projetospring.entities.Category;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository CategoryRepository;


    public List<Category> findAll() {
        return CategoryRepository.findAll();
    }

    public Category findById(Long id) {
        return CategoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

    /*@GetMapping
    public Category findById(Long id) {
        Optional<Category> Category = CategoryRepository.findById(id);

        //sugestão da Ide se tem o valor retorna se não coloca null
        return Category.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        //return Category.get();
    }*/

   /* @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findbyId(@PathVariable Long id){
        Category Category = CategoryRepository.findById(id).get();
        return ResponseEntity.ok().body(Category);
    }*/
}


