package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
