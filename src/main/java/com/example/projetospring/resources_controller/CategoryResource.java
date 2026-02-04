package com.example.projetospring.resources_controller;

import com.example.projetospring.entities.Category;
import com.example.projetospring.services_funcoes.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/Categories")
public class CategoryResource {

    @Autowired
    private CategoryService CategoryService;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = CategoryService.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findbyId(@PathVariable Long id){
        Category Category = CategoryService.findById(id);
        return ResponseEntity.ok().body(Category);
    }
}
