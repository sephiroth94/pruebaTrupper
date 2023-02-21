package com.clientes.repository.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class ListaCompra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer listaId;
	@OneToMany
	@JoinColumn(name = "idCliente")
	private Clientes customerId;
	
	private Date fechaRegistro;
	private Date fechaUltimaActualizacion;
	private byte[] archivo;
	
	@ManyToOne(targetEntity = ListaCompraDetalle.class)
	private List<ListaCompraDetalle> listaCompraDetalle;

	public Integer getListaId() {
		return listaId;
	}

	public void setListaId(Integer listaId) {
		this.listaId = listaId;
	}

	public Clientes getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Clientes customerId) {
		this.customerId = customerId;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaUltimaActualizacion() {
		return fechaUltimaActualizacion;
	}

	public void setFechaUltimaActualizacion(Date fechaUltimaActualizacion) {
		this.fechaUltimaActualizacion = fechaUltimaActualizacion;
	}

	public byte[] getArchivo() {
		return archivo;
	}

	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}

	public List<ListaCompraDetalle> getListaCompraDetalle() {
		return listaCompraDetalle;
	}

	public void setListaCompraDetalle(List<ListaCompraDetalle> listaCompraDetalle) {
		this.listaCompraDetalle = listaCompraDetalle;
	}
	
	
		
	
}
