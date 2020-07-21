package idat.com.demo.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import idat.com.demo.interfaceService.IProductosService;
import idat.com.demo.modelo.Productos;

@Controller
@RequestMapping
public class Controlador2 {
	@Autowired
	private IProductosService service;

	@GetMapping("/listarProductos")
	public String listar(Model model) {
		List<Productos> productos = service.listar();
		model.addAttribute("productos", productos);
		return "index2";
	}

	@GetMapping("/newProd")
	public String agregar(Model model) {
		model.addAttribute("productos", new Productos());
		return "form2";
	}

	@PostMapping("/saveProductos")
	public String save(Productos p, Model model) {
		service.save(p);
		return "redirect:/listarProductos";
	}

	@GetMapping("/editarProd/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Productos> productos = service.listarId(id);
		model.addAttribute("productos", productos);
		return "form2";
	}

	@GetMapping("/eliminarProd/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listarProductos";
	}

}
