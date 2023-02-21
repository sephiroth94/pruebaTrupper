package com.clientes.repository.model;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class ListaCompraDetalle {
	@EmbeddedId
	LlaveCompuestaProducto llave;
	
	@OneToMany
	@JoinColumn(name = "idCliente")
	private ListaCompra listaCompra;
	
	@ManyToOne(targetEntity = ListaCompra.class)
	private List<Productos> productos;
	
	
	private Integer cantidad;
	
	


	public ListaCompraDetalle(LlaveCompuestaProducto llave, ListaCompra listaCompra, List<Productos> productos,
			Integer cantidad) {
		super();
		this.llave = llave;
		this.listaCompra = listaCompra;
		this.productos = productos;
		this.cantidad = cantidad;
	}
	
	public ListaCompraDetalle() {
	}


	public LlaveCompuestaProducto getLlave() {
		return llave;
	}


	public void setLlave(LlaveCompuestaProducto llave) {
		this.llave = llave;
	}


	public ListaCompra getListaCompra() {
		return listaCompra;
	}


	public void setListaCompra(ListaCompra listaCompra) {
		this.listaCompra = listaCompra;
	}


	public List<Productos> getProductos() {
		return productos;
	}


	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}


	public Integer getCantidad() {
		return cantidad;
	}


	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
}
