package com.example.projetospring.services;

import com.example.projetospring.entities.User;
import com.example.projetospring.exceptions.ResourceNotFoundException;
import com.example.projetospring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

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

    /*@GetMapping
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);

        //sugestão da Ide se tem o valor retorna se não coloca null
        return user.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        //return user.get();
    }*/

   /* @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id){
        User user = userRepository.findById(id).get();
        return ResponseEntity.ok().body(user);
    }*/
}


