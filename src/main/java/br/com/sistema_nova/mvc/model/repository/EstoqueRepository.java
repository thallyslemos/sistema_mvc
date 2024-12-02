
package br.com.sistema_nova.mvc.model.repository;

import br.com.sistema_nova.mvc.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {
}