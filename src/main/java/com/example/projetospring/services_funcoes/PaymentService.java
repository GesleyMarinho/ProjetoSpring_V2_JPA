package com.example.projetospring.services_funcoes;

import com.example.projetospring.entities.Payment;
import com.example.projetospring.services_funcoes.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories_acesso_banco.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository PaymentRepository;


    public List<Payment> findAll() {
        return PaymentRepository.findAll();
    }

    public Payment findById(Long id) {
        return PaymentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }

}


