package br.com.ecommerce.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemVenda {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Venda venda;

    @ManyToOne
    private Produto produto; // Qual produto foi vendido

    private Integer quantidade;
    private BigDecimal precoUnitarioMomento; // Preço fixado na hora da venda
}