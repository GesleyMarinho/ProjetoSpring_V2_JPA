package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
