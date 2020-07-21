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

import idat.com.demo.interfaces.ICategorias;
import idat.com.demo.modelo.Categorias;

@RestController

@RequestMapping("/rest_categorias")
public class RestCategorias {
	@Autowired

	private ICategorias data;

	@GetMapping

	public List<Categorias> listar() {

		return (List<Categorias>) data.findAll();

	}

	@PostMapping

	public void insertar(@RequestBody Categorias cat) {

		data.save(cat);

	}

	@PutMapping
	public void modificar(@RequestBody Categorias cat) {
		data.save(cat);

	}

	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		data.deleteById(id);
	}

}
