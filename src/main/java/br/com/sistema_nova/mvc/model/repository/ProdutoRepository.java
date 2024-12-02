package br.com.sistema_nova.mvc.model.repository;

import br.com.sistema_nova.mvc.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}