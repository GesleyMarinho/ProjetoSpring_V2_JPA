package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
