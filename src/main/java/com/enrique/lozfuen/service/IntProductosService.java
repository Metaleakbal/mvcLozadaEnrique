package com.enrique.lozfuen.service;

import java.util.List;

import com.enrique.lozfuen.entity.Producto;

public interface IntProductosService {
	
	public List<Producto> obtenerProductos();
	
	public void guardar(Producto producto);

	public void eliminar(Integer idProducto);
	
	public Producto buscar(Integer idProducto);
}
