package br.com.ecommerce.model;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Logistica {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;//: Identificador.
	
	@OneToOne
	@JoinColumn(name = "venda_id")
	private Venda venda;//: Referência à Venda.
	
	private String codigoRastreio;//: O código para o cliente acompanhar nos Correios ou transportadora.
	
	private String transportadora;//: Nome da empresa responsável.
	
	LocalTime dataPostagem;//: Quando o produto saiu do seu estoque.
}
