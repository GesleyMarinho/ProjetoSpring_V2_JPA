package com.example.projetospring.resources;

import com.example.projetospring.entities.Category;
import com.example.projetospring.services.CategoryService;
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

   /* @GetMapping
    public Category findById(Long id) {
        Optional<Category> Category = Optional.ofNullable(CategoryService.findById(id));

        //sugestão da Ide se tem o valor retorna se não coloca null
        //return Category.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        return Category.get();
    }*/

    @GetMapping(value = "/{id}")
    public ResponseEntity<Category> findbyId(@PathVariable Long id){
        Category Category = CategoryService.findById(id);
        return ResponseEntity.ok().body(Category);
    }
}
