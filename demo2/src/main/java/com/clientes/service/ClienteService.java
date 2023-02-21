package com.clientes.service;

import java.util.Iterator;
import java.util.List;

import com.clientes.repository.model.ListaCompra;
import com.clientes.repository.model.ListaCompraDetalle;
import com.clientes.repository.model.Productos;

public interface ClienteService {
	
	public Iterator<ListaCompra> obtieneListaCompra(Integer idCliente);
	public void actualizaListaCliente(Integer idCliente, List<Productos> productosNuevos);
	public void eliminaLista(List<ListaCompra> listaCompra, List<ListaCompraDetalle> listaDetalle);
}
