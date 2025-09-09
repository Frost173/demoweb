package com.example.demoweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoweb.entities.Usuario;

public interface UsuarioRepositories extends JpaRepository<Usuario, Long>{

}
