package br.com.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ecommerce.dto.ProdutoDto;
import br.com.ecommerce.model.Produto;
import br.com.ecommerce.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	ProdutoService service;
	@PostMapping
	public ResponseEntity<ProdutoDto> salvar(ProdutoDto request){
		
		
		Produto produto = Produto.builder()
				.setDescricao(request.descricao())
				//.setEstoque(request.estoque())
				.setNome(request.nome())
				.setPreco(request.preco())
				.build();
		
		service.salvarProduto(produto);
		System.out.println(request);
		return ResponseEntity.ok(request);
	}
}
