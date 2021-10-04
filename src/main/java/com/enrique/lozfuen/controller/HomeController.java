package com.enrique.lozfuen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.enrique.lozfuen.entity.Producto;
import com.enrique.lozfuen.service.IntProductosService;

@Controller
public class HomeController {
	
	@Autowired
	private IntProductosService productosService;
	
	@GetMapping("login")
	public String login() {
		return"login";
	}
	
	@GetMapping("/")
	public String mostrarIndex(Model model) {
		List<Producto> lista = productosService.obtenerProductos();
		model.addAttribute("productos", lista);
		return"index";
	}
	


}
