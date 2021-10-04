package com.enrique.lozfuen.entity;

import java.time.LocalDate;

public class Producto {
	
	private Integer id;
	private String nombre;
	private String descripcion;
	private String marca;
	private Double precio;
	private LocalDate fechaProduccion;
	private String imagen;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public LocalDate getFechaProduccion() {
		return fechaProduccion;
	}
	public void setFechaProduccion(LocalDate fechaProduccion) {
		this.fechaProduccion = fechaProduccion;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", precio=" + precio + ", fechaProduccion=" + fechaProduccion + ", imagen=" + imagen + "]";
	}
	


}
