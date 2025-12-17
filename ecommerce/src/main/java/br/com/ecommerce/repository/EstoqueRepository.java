package br.com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.model.Estoque;
@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
