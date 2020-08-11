package br.com.icc.microservice.fornecedor.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.icc.microservice.fornecedor.model.InfoFornecedor;

@Repository
public interface InfoRepository extends CrudRepository<InfoFornecedor, Long>{

	InfoFornecedor findByEstado(String estado);
}
