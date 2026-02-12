package com.example.projetospring.services_funcoes.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Long id) {

        super("Usuário com id " + id + " não foi encontrado");
    }
}
