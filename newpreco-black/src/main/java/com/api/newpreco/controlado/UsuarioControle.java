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
import org.springframework.web.bind.annotation.RestController;

import com.api.newpreco.modelo.Usuario;
import com.api.newpreco.serviso.Usuarioservico;

@RestController
@RequestMapping("/usuario")
public class UsuarioControle {
    @Autowired
    private Usuarioservico usuarioServico;
    @GetMapping
    public List<Usuario>getUsuarios(){
        return this.usuarioServico.getUsuarios();  
    }
    @GetMapping("/{id}")
    public Usuario getUsuarioPorId(@PathVariable("id") Long idUsuario) {
        return this.usuarioServico.getUsuarioPorId(idUsuario);
    }
    @PostMapping 
    public Usuario inserir(@RequestBody Usuario novoUsuario) {
        return this.usuarioServico.inserirOuAtualizar(novoUsuario);
    }
    @PutMapping("/{id}")
    public Usuario atualizar(@RequestBody Usuario usuario) {
        return this.usuarioServico.inserirOuAtualizar(usuario);
    }

    @DeleteMapping("/{id}")
    public void apagar(@PathVariable("id") Long id) {
        this.usuarioServico.apagar(id);
    }

}