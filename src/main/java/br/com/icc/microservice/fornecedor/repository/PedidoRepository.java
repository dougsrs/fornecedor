package br.com.icc.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.icc.microservice.fornecedor.model.Pedido;

public interface PedidoRepository extends CrudRepository<Pedido, Long>{

}
