package com.example.proyecto03.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.proyecto03.interfacesService.ICategoriaService;
import com.example.proyecto03.modelo.Categoria;

@Controller
@RequestMapping
public class Controlador {
		
	@Autowired
	private ICategoriaService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Categoria>categoria=service.listar();
		model.addAttribute("categoria",categoria);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {		
		model.addAttribute("categoria",new Categoria());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(Categoria c,Model model) {		
		service.save(c);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Categoria>categoria=service.listarId(id);
		model.addAttribute("categoria",categoria);
		return "form";
	}	
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
		
	
}
