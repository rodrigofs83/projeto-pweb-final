package com.api.newpreco.serviso;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.newpreco.modelo.Usuario;
import com.api.newpreco.repositorio.UsuarioReposiorioIF;

@Service
public class Usuarioservico {
    @Autowired
    private UsuarioReposiorioIF usuarioRepositorio;

	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub

		return this.usuarioRepositorio.findAll();
	}

	public Usuario getUsuarioPorId(Long idUsuario) {
		// TODO Auto-generated method stub
		return this.usuarioRepositorio.findById(idUsuario).orElse(null);
	}

	public Usuario inserirOuAtualizar(Usuario novoUsuario) {
		// TODO Auto-generated method stub
		Usuario usuarioInserido = this.usuarioRepositorio.save(novoUsuario);
        return usuarioInserido;
	}

	public void apagar(Long id) {
		// TODO Auto-generated method stub
		this.usuarioRepositorio.deleteById(id);
	}
   
}