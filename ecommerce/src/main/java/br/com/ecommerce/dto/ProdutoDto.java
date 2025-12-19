package br.com.ecommerce.dto;

import java.math.BigDecimal;

public record ProdutoDto (

	 String nome,
     String descricao,
     BigDecimal preco,
     br.com.ecommerce.dto.Estoque estoque
     ){
     
     
}
