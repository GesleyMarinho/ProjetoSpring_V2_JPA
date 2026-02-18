package com.example.projetospring.services_funcoes.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Long id) {

        super("O " + id + " não foi encontrado");
    }
}
