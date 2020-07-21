package com.example.proyecto03.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.proyecto03.interfacesService.IProductoService;
import com.example.proyecto03.modelo.Producto;

public class Controlador1 {

	
	@Autowired
	private IProductoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Producto>producto=service.listar();
		model.addAttribute("producto",producto);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {		
		model.addAttribute("producto",new Producto());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(Producto p,Model model) {		
		service.save(p);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Producto>producto=service.listarId(id);
		model.addAttribute("producto",producto);
		return "form";
	}	
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
		
	

}
