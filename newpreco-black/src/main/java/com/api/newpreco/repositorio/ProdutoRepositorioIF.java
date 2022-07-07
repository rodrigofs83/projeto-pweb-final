package com.api.newpreco.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.newpreco.modelo.Produto;

public interface ProdutoRepositorioIF extends JpaRepository<Produto,Long>{
    
}