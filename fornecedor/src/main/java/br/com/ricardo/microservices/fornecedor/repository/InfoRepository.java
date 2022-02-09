package br.com.ricardo.microservices.fornecedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ricardo.microservices.fornecedor.model.InfoFornecedor;

public interface InfoRepository extends JpaRepository<InfoFornecedor, Long> {
	
	InfoFornecedor findByEstado(String estado);

}
