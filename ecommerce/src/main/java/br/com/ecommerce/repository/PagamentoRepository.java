package br.com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.model.Pagamento;
@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
