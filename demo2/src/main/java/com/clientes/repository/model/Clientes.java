package com.clientes.repository.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer idCliente;
	
	@ManyToOne(targetEntity = ListaCompra.class)
	private List<ListaCompra> lista;
	
	private String nombre;
	private byte[] archivo;
	
	
	public Clientes() {
	
	}
	
	public Clientes(Integer idCliente, List<ListaCompra> lista, String nombre, byte[] archivo) {
		super();
		this.idCliente = idCliente;
		this.lista = lista;
		this.nombre = nombre;
		this.archivo = archivo;
	}


	public List<ListaCompra> getLista() {
		return lista;
	}


	public void setLista(List<ListaCompra> lista) {
		this.lista = lista;
	}


	public Integer getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public byte[] getArchivo() {
		return archivo;
	}



	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}





	public Clientes(Integer idCliente, String nombre, byte[] archivo) {
		super();
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.archivo = archivo;
	}





	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombre=" + nombre + ", archivo=" + Arrays.toString(archivo)
				+ "]";
	}
	
	
	
	
}
