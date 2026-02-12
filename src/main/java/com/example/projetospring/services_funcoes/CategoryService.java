package com.example.projetospring.services_funcoes;

import com.example.projetospring.entities.Category;
import com.example.projetospring.services_funcoes.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories_acesso_banco.CategoryRepository;
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

}


