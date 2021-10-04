package com.enrique.lozfuen.service;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.enrique.lozfuen.entity.Producto;

@Service
public class ProductosServiceImp implements IntProductosService {

	private List<Producto> lista;

	public ProductosServiceImp() {
		lista = new LinkedList<Producto>();

		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");

		try {
			Producto p = new Producto();
			p.setId(1);
			p.setNombre("Computadora");
			p.setDescripcion("Laptop");
			p.setMarca("Dell");
			p.setPrecio(14000.0);
			p.setFechaProduccion(LocalDate.parse("15-02-2020", formato));
			p.setImagen("L341I5CL81TW10P1W.jpg");
			lista.add(p);
			
			Producto p2 = new Producto();
			p2.setId(2);
			p2.setNombre("Television");
			p2.setDescripcion("pantalla 55'");
			p2.setMarca("LG");
			p2.setPrecio(10000.0);
			p2.setFechaProduccion(LocalDate.parse("20-11-2018", formato));
			p2.setImagen("índice.jpg");
			lista.add(p2);
			
			Producto p3 = new Producto();
			p3.setId(3);
			p3.setNombre("Celular");
			p3.setDescripcion("Telefono inteligente");
			p3.setMarca("Samsung");
			p3.setPrecio(8000.0);
			p3.setFechaProduccion(LocalDate.parse("25-09-2017", formato));
			p3.setImagen("celular-samsung-galaxy-s10-negro-128-gb-celularymas-celulares-y-tablets.jpg");
			lista.add(p3);
			
			Producto p4 = new Producto();
			p4.setId(4);
			p4.setNombre("Bocina");
			p4.setDescripcion("Altavoz inalambrico Bluetooth");
			p4.setMarca("JBL");
			p4.setPrecio(12300.0);
			p4.setFechaProduccion(LocalDate.parse("16-12-2019", formato));
			p4.setImagen("D_NQ_NP_813693-MLA32800718220_112019-O.jpg");
			lista.add(p4);

		} catch (DateTimeException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

	@Override
	public List<Producto> obtenerProductos() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer idProducto) {
		// TODO Auto-generated method stub
		lista.remove(buscar(idProducto));
	}

	@Override
	public Producto buscar(Integer idProducto) {
		// TODO Auto-generated method stub
		for (Producto p : lista) {
			if (p.getId() == idProducto) {
				return p;
			}
		}
		return null;
	}

}
