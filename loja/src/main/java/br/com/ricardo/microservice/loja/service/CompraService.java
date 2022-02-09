package br.com.ricardo.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ricardo.microservice.loja.client.FornecedorClient;
import br.com.ricardo.microservice.loja.controller.dto.CompraDTO;
import br.com.ricardo.microservice.loja.controller.dto.InfoFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private FornecedorClient fornecedorClient;
	
	public void realizarCompra(CompraDTO compra) {
		
		InfoFornecedorDTO info = fornecedorClient.getInfoPorEstado(compra.getEndereco().getEstado());
		System.out.println(info.getEndereco());

	}

}
