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

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);

    }

    public User update(Long id, User user) {
        User entity = userRepository.getReferenceById(id);
       updateData(entity, user);

        return userRepository.save(entity);
    }

    private void updateData(User entity, User user) {
        entity.setNome(user.getNome());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());

    }
}


