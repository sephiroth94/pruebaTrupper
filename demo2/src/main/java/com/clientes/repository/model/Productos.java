package com.clientes.repository.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idProducto;
	private ListaCompra listaCompra;
	private String clave;
	private String descripcion;
	private  byte[] archivo;
	
	public Productos() {
		
	}
	
	public Productos(Integer idProducto, ListaCompra listaCompra, String clave, String descripcion, byte[] archivo) {
		super();
		this.idProducto = idProducto;
		this.listaCompra = listaCompra;
		this.clave = clave;
		this.descripcion = descripcion;
		this.archivo = archivo;
	}
	public Integer getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	public ListaCompra getListaCompra() {
		return listaCompra;
	}
	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public byte[] getArchivo() {
		return archivo;
	}
	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	
	
	
}
