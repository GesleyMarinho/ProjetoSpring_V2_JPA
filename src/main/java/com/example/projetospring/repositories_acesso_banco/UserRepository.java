package com.example.projetospring.repositories_acesso_banco;

import com.example.projetospring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
