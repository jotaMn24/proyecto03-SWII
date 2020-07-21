package com.example.proyecto03.interfaces;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.proyecto03.modelo.Usuario;

@Repository
public interface IUsuario extends CrudRepository<Usuario, Long>  {
    public Optional<Usuario> findByUsername(String username);
}
