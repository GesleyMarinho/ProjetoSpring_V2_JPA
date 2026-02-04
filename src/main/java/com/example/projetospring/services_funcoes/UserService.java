package com.example.projetospring.services_funcoes;

import com.example.projetospring.entities.User;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories_acesso_banco.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(id));
    }
}


