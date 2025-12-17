package br.com.ecommerce.model;

import java.time.LocalDate;
import java.time.LocalTime;

import br.com.ecommerce.enums.StatusPagamento;
import br.com.ecommerce.enums.TipoPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;//: Identificador.
	
	@OneToOne
	@JoinColumn(name = "venda_id")
	private Venda venda;//: Referência à Venda.
	
	private String codigoRastreio;//: O código para o cliente acompanhar nos Correios ou transportadora.
	
	private String transportadora;//: Nome da empresa responsável.
	
	LocalTime dataPostagem;//: Quando o produto saiu do seu estoque.
}
