package com.api.newpreco.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.api.newpreco.modelo.Usuario;

@Repository
public class UsuarioRepositorio {
    @PersistenceContext
    private EntityManager entityManager;
    private List<Usuario> getUsuario(){
    	return this.entityManager.createQuery("SELECT u FROM Usuario u").getResultList();
    }
    private Usuario findById(Long idUsuario){
    	TypedQuery<Usuario> query = this.entityManager.createQuery("SELECT u " +
    	        "FROM Usuario u where u.id=:id", Usuario.class).
    	        setParameter("id", idUsuario);
    	        return query.getSingleResult();
    	
    }
}