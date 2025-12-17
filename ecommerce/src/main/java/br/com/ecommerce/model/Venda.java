package br.com.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import br.com.ecommerce.enums.StatusVenda;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Venda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;//: Número do pedido.
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;//: Referência (@ManyToOne) ao Cliente que comprou.

	private LocalDate dataVenda;//: Data e hora exata da compra.
	
	private StatusVenda statusVenda;//: Enum (AGUARDANDO_PAGAMENTO, PAGO, EM_TRANSPORTE, ENTREGUE, CANCELADO).

	@OneToMany(mappedBy = "venda", cascade = CascadeType.ALL)
    private List<ItemVenda> itens; // Lista de produtos comprados

	@OneToOne(mappedBy = "venda")
	private Logistica loggistica;
	
	private double valorTotal;//: Somatório dos itens + frete - descontos.

	@OneToOne(mappedBy = "venda")
	Pagamento pagamento;
	
}
