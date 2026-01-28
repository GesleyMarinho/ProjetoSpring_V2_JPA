package com.example.projetospring.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Long id) {
        super("Usuário com id " + id + " não foi encontrado");
    }
}
