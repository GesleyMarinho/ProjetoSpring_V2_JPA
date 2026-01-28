package com.example.projetospring.resources;

import com.example.projetospring.entities.User;
import com.example.projetospring.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        //User user = new User("Gesley", "g@g.com", "3136245302", "123456");
        List<User> list = userService.findAll();

        return ResponseEntity.ok().body(list);
    }

   /* @GetMapping
    public User findById(Long id) {
        Optional<User> user = Optional.ofNullable(userService.findById(id));

        //sugestão da Ide se tem o valor retorna se não coloca null
        //return user.orElse(null);

        // aqui só retorna se existir mesmo o valor, caso contrario var gerar um exceção.
        return user.get();
    }*/

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findbyId(@PathVariable Long id){
        User user = userService.findById(id);
        return ResponseEntity.ok().body(user);
    }
}
