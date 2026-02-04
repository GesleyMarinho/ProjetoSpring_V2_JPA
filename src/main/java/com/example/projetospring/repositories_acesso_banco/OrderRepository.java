package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
