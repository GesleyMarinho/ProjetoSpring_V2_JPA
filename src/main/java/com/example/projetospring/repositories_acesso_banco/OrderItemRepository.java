package com.example.projetospring.repositories;

import com.example.projetospring.entities.OrderItem;
import com.example.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
