package com.example.projetospring.resources_controller;

import com.example.projetospring.entities.Payment;
import com.example.projetospring.services_funcoes.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

    @Autowired
    private PaymentService PaymentService;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> list = PaymentService.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Payment> findbyId(@PathVariable Long id){
        Payment Payment = PaymentService.findById(id);
        return ResponseEntity.ok().body(Payment);
    }
}
