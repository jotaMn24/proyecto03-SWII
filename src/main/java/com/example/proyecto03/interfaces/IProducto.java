package com.example.proyecto03.interfaces;
import org.springframework.data.repository.CrudRepository;

import com.example.proyecto03.modelo.Producto;

public interface IProducto extends CrudRepository<Producto, Integer>  {

}



