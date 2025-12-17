package br.com.ecommerce.model;

import java.time.LocalDate;

import br.com.ecommerce.enums.StatusPagamento;
import br.com.ecommerce.enums.TipoPagamento;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Endereco {
	String CEP; 
	String Rua;
	String Número;
	String Bairro;
	String Cidade ;
	String UF;
}
