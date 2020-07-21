package com.example.proyecto03.interfaces;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.proyecto03.modelo.Categoria;



@Repository
public interface ICategoria extends CrudRepository<Categoria, Integer>   {

}

