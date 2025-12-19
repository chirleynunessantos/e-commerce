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

    
       public static ProdutoBuilder builder() {
        	 return new ProdutoBuilder();
         }
 
    private  Produto(ProdutoBuilder produtoBuilder) {
		super();
		this.codigo =    produtoBuilder.codigo;
		this.nome =	     produtoBuilder.nome;
		this.descricao = produtoBuilder.descricao;
		this.preco =     produtoBuilder.preco;
		this.estoque =   produtoBuilder.estoque;
	}




	public static class ProdutoBuilder{
    	
    	long codigo;
    	 String nome;
         String descricao;
         BigDecimal preco;
         Estoque estoque;
         
      
		
        public ProdutoBuilder setCodigo(long codigo) {
			this.codigo = codigo;
			return this;
		}
		public ProdutoBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}
		public ProdutoBuilder setDescricao(String descricao) {
			this.descricao = descricao;
			return this;
		}
		public ProdutoBuilder setPreco(BigDecimal preco) {
			this.preco = preco;
			return this;
		}
		public ProdutoBuilder setEstoque(Estoque estoque) {
			this.estoque = estoque;
			return this;
		}
        
        public Produto build() {
        	return new Produto(this);
        }
        
        
    }
}
