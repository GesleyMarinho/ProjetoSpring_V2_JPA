package com.example.projetospring.services_funcoes;

import com.example.projetospring.entities.Order;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories_acesso_banco.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

}


