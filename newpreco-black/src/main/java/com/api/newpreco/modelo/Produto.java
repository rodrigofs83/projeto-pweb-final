package com.api.newpreco.modelo;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;



@Entity
@Table(name="tb_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String nome;
    private String categoria;
    private double  preco;
    private String imagem;
    @ManyToOne
    //@JoinColumn(name = "usuario_id")
    private Usuario usuario;
    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return double return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return String return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public void setUsuario(Usuario usuario){
    	this.usuario = usuario;
    }
    public Usuario getUsuario(){
    	return this.usuario;
    }
}