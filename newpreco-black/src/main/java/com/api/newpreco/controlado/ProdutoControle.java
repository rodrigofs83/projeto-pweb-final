package com.api.newpreco.controlado;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.api.newpreco.modelo.Produto;
import com.api.newpreco.serviso.ProdutoServico;

@RestController
@RequestMapping("/produtos")
public class ProdutoControle {
    @Autowired
    private ProdutoServico produtoServico;

	@GetMapping
	public List<Produto> getProdutos(){
        return this.produtoServico.getProdutos();
    }
    @GetMapping("/{id}")
    public Produto getProdutoPorId(@PathVariable("id") Long idProduto) {
        return this.produtoServico.getProdutoPorId(idProduto);
    }
    @PostMapping 
    public Produto inserir(@RequestBody Produto novoProduto) {
        return this.produtoServico.inserirOuAtualizar(novoProduto);
    }
    @PutMapping("/{id}")
    public Produto atualizar(@RequestBody Produto produto) {
        return this.produtoServico.inserirOuAtualizar(produto);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.produtoServico.apagar(id);
    }

}