package com.example.proyecto03.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.proyecto03.interfaces.IProducto;
import com.example.proyecto03.modelo.Producto;

public class RestProducto {


	
	@Autowired
	private IProducto data;
	
	@GetMapping
	public List<Producto> listar() {
	return (List<Producto>)data.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Producto cat) {
	data.save(cat);
	}

	@PutMapping
	public void modificar(@RequestBody Producto cat) {
	data.save(cat);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}

}
