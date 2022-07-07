package com.api.newpreco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.newpreco.modelo.Produto;
import com.api.newpreco.modelo.Usuario;


public interface UsuarioReposiorioIF extends JpaRepository<Usuario,Long> {
    
}