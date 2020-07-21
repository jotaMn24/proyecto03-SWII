package com.example.proyecto03.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping({"/","/login"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/index1")
	public String user() {
		return "index1";
	}
	
	@GetMapping("/index2")
	public String admin() {
		return "productos";
	}
}