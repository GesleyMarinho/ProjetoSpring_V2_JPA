package com.example.projetospring.resources;

import com.example.projetospring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User("Gesley", "g@g.com", "3136245302", "123456");

        return ResponseEntity.ok(user);

    }
}
