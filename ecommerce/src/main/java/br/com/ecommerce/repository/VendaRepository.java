package br.com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
