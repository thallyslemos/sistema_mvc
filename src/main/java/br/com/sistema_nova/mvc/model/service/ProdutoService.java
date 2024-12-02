
package br.com.sistema_nova.mvc.model.service;

import br.com.sistema_nova.mvc.model.Produto;
import br.com.sistema_nova.mvc.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Produto obterProduto(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }
}