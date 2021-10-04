package com.enrique.lozfuen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.enrique.lozfuen.entity.Producto;
import com.enrique.lozfuen.service.IntProductosService;

@Controller
@RequestMapping("/productos")
public class ProductosController {
	
	@Autowired
	private IntProductosService productosService;
	
	@GetMapping("/eliminar")
	public String eliminarProducto(@RequestParam("id") int idProducto,Model moldel) {
		productosService.eliminar(idProducto);
		//Una segunda petición(interna)
		return"redirect:/productos/lista";
	}
	
	@GetMapping("/detalles")
	public String detalles(@RequestParam("id") int idProducto, Model model) {
		System.out.println("Id Producto = " + idProducto);
		Producto producto = productosService.buscar(idProducto);
		model.addAttribute(producto);
		return "detalles";
	}
	
	@GetMapping("/lista")
	public String lista(Model model){
		List<Producto> lista = productosService.obtenerProductos();
		for(Producto p : lista ) {
			System.out.println(p.getId() + " => " + p.getNombre());
		}
		model.addAttribute("msg", "Lista de Productos.");
		model.addAttribute("productos", lista);
		return "productos/index";
		
	}

}
