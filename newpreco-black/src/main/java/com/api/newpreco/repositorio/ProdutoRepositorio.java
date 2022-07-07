package com.api.newpreco.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.api.newpreco.modelo.Produto;

@Repository
public class ProdutoRepositorio  {
    @PersistenceContext
    private EntityManager entityManager;
    public List<Produto> getProdutos(){
        return this.entityManager.createQuery("SELECT p " +
                "FROM Produto p").getResultList();
    }
	public Produto findById(Long idProduto) {
        TypedQuery<Produto> query = this.entityManager.createQuery("SELECT p " +
        "FROM Produto p where p.id=:id", Produto.class).
        setParameter("id", idProduto);
        return query.getSingleResult();
	}
	
}