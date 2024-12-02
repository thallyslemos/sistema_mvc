
package br.com.sistema_nova.mvc.model.service;

import br.com.sistema_nova.mvc.model.Estoque;
import br.com.sistema_nova.mvc.model.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public Estoque criarEstoque(Estoque estoque) {
        return estoqueRepository.save(estoque);
    }

    public Estoque obterEstoque(Long id) {
        return estoqueRepository.findById(id).orElse(null);
    }

    public List<Estoque> listarEstoques() {
        return estoqueRepository.findAll();
    }
}