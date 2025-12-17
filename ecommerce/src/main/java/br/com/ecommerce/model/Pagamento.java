package br.com.ecommerce.model;

import java.time.LocalDate;

import br.com.ecommerce.enums.StatusPagamento;
import br.com.ecommerce.enums.TipoPagamento;
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
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//: Identificador.
	
	@OneToOne
	@JoinColumn(name="venda_id")
	Venda venda;//: Referência (@OneToOne) à Venda.
	
	TipoPagamento tipoPagamento;//: Enum (CARTAO_CREDITO, PIX, BOLETO).
	StatusPagamento statusPagamento;//: Enum (PENDENTE, APROVADO, REJEITADO, ESTORNADO).
	private String transacaoId;//: O código que o banco ou gateway de pagamento gera.
	private LocalDate dadataProcessamento;//: Quando o banco confirmou o recebimento.
	double valorPago;//: Valor real recebido (útil se houver taxas ou descontos).
}
