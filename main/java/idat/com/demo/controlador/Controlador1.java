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

import idat.com.demo.interfaceService.ICategoriasService;
import idat.com.demo.modelo.Categorias;

@Controller
@RequestMapping
public class Controlador1 {
	@Autowired
	private ICategoriasService service;
	
	@GetMapping("/listarCategorias")
	public String listar(Model model) {
		List<Categorias>categorias=service.listar();
		model.addAttribute("categorias",categorias);
		return "index1";
	}
	
   @GetMapping("/newCatg")                                        	
	public String agregar(Model model) {		
		model.addAttribute("categorias",new Categorias());
		return "form1";
	}
	
	@PostMapping("/saveCategoria")
	public String save( Categorias c,Model model) {		
		service.save(c);
		return "redirect:/listarCategorias";
	}
	
	@GetMapping("/editarCatg/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Categorias>categorias=service.listarId(id);
		model.addAttribute("categorias",categorias);
		return "form1";
	}	
	
	@GetMapping("/eliminarCatg/{idcategoria}")
	public String delete(Model model, @PathVariable int idcategoria) {
		service.delete(idcategoria);
		return "redirect:/listarCategorias";
	}
	
	
}
