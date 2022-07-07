package com.api.newpreco.serviso;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.newpreco.modelo.Produto;
import com.api.newpreco.repositorio.ProdutoRepositorioIF;

@Service
public class ProdutoServico {
    @Autowired
    private ProdutoRepositorioIF produtoRepositorio;
    public List<Produto> getProdutos() {
        return this.produtoRepositorio.findAll();
    }
	public Produto getProdutoPorId(Long idProduto) {
		// TODO Auto-generated method stub
		return this.produtoRepositorio.findById(idProduto).orElse(null);
	}
	public Produto inserirOuAtualizar(Produto novoProduto) {
		// TODO Auto-generated method stub
		Produto produtoInserido = this.produtoRepositorio.save(novoProduto);
        return produtoInserido;
		
	}
	public void apagar(Long id) {
		// TODO Auto-generated method stub
		this.produtoRepositorio.deleteById(id);
	}

}