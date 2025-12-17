package br.com.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="PRODUTOS")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long codigo;
	private String nome;
    private String descricao;
    private BigDecimal preco;
    
    @OneToOne(mappedBy = "produto")
    private Estoque estoque;

}
