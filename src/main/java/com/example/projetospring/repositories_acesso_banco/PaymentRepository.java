package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
}
