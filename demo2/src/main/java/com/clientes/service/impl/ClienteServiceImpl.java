package com.clientes.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clientes.repository.ClienteRepository;
import com.clientes.repository.model.ListaCompra;
import com.clientes.repository.model.ListaCompraDetalle;
import com.clientes.repository.model.Productos;
import com.clientes.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Iterator<ListaCompra> obtieneListaCompra(Integer idCliente) {
		
		return null;
	}

	@Override
	public void actualizaListaCliente(Integer idCliente, List<Productos> productosNuevos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminaLista(List<ListaCompra> listaCompra, List<ListaCompraDetalle> listaDetalle) {
		// TODO Auto-generated method stub
		
	}
	
	
}
