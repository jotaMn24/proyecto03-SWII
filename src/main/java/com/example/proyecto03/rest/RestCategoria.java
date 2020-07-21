package com.example.proyecto03.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



import com.example.proyecto03.interfaces.ICategoria;
import com.example.proyecto03.modelo.Categoria;

public class RestCategoria {

	
	@Autowired
	private ICategoria data;
	
	@GetMapping
	public List<Categoria> listar() {
	return (List<Categoria>)data.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody Categoria cat) {
	data.save(cat);
	}

	@PutMapping
	public void modificar(@RequestBody Categoria cat) {
	data.save(cat);
	}
	
	@DeleteMapping(value = "/{idcategoria}")
	public void eliminar(@PathVariable("idcategoria") Integer idcategoria) {
		data.deleteById(idcategoria);
	}

}
