package com.clientes.repository.model;

import javax.persistence.Embeddable;

@Embeddable
public class LlaveCompuestaProducto {
	private Integer idListaCompra;
	private String codigoProducto;
	
	
	public LlaveCompuestaProducto() {
	}
	
	public LlaveCompuestaProducto(Integer idListaCompra, String codigoProducto) {
		super();
		this.idListaCompra = idListaCompra;
		this.codigoProducto = codigoProducto;
	}
	public Integer getIdListaCompra() {
		return idListaCompra;
	}
	public void setIdListaCompra(Integer idListaCompra) {
		this.idListaCompra = idListaCompra;
	}
	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	
	
}
