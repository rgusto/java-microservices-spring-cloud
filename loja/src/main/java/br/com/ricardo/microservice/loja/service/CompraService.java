package br.com.ricardo.microservice.loja.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardo.microservice.loja.client.FornecedorClient;
import br.com.ricardo.microservice.loja.controller.dto.CompraDTO;
import br.com.ricardo.microservice.loja.controller.dto.InfoFornecedorDTO;


@Service
public class CompraService {

	@Autowired
	private FornecedorClient fornecedorClient;

	private Logger logger = Logger.getLogger(CompraService.class.getName());

	public void realizarCompra(CompraDTO compra) {
		
		logger.log(Level.INFO, "Buscando informações do Fornecedor");
		
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		System.out.println(info.getEndereco());

	}

}
