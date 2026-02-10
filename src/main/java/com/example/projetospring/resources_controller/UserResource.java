package com.example.projetospring.resources_controller;

import com.example.projetospring.entities.User;
import com.example.projetospring.services_funcoes.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
    //A classe ou pacotes Resource é para os END POINTS do API
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = userService.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id) {
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }

    //Ajustar no construtor a criação do usuário.
    @PostMapping
    public ResponseEntity<User> save(@RequestBody User user) {
        User u = userService.save(user);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(u.getId()).toUri();
        return ResponseEntity.created(uri).body(u);
    }
}
