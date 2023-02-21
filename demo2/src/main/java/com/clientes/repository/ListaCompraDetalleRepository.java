package com.clientes.repository;

import org.springframework.data.repository.CrudRepository;

import com.clientes.repository.model.ListaCompraDetalle;
import com.clientes.repository.model.LlaveCompuestaProducto;

public interface ListaCompraDetalleRepository extends CrudRepository<ListaCompraDetalle, LlaveCompuestaProducto>{

}
