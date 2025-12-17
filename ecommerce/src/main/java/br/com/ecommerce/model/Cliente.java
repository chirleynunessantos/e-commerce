package br.com.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomeCompleto;//: Nome para notas fiscais e entregas.
	
	private  String cpfCnpj;//: Essencial para emissão de nota fiscal (validar se é único).
	
	private  String email;//: Usado para login e notificações de venda.
	
	private  String telefone;//: Contato para a logística.
	
	private LocalDate dataNascimento;//: Útil para marketing e validação de idade.
	
	@OneToOne(mappedBy = "cliente")
	private Endereco endereco;//: (Pode ser uma classe separada @Embedded) contendo CEP, Rua, Número, Bairro, Cidade e UF.

	@OneToMany(mappedBy = "cliente")
	private List<Venda> venda;
}
