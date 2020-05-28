package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class controlador {
	
@GetMapping("/")
	public String Inicio(Model modelo) {
	String mensaje = "Hola desde el controlador";
	modelo.addAttribute("Saludo", mensaje);
	return "index";
	}

}
