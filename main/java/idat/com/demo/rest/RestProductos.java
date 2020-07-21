package idat.com.demo.rest;

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

import idat.com.demo.interfaces.IProductos;
import idat.com.demo.modelo.Productos;

@RestController

@RequestMapping("/rest_productos")

public class RestProductos {
	@Autowired

	private IProductos data;

	@GetMapping

	public List<Productos> listar() {

		return (List<Productos>) data.findAll();

	}

	@PostMapping

	public void insertar(@RequestBody Productos prod) {

		data.save(prod);

	}

	@PutMapping
	public void modificar(@RequestBody Productos prod) {
		data.save(prod);

	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}

}
