
package br.com.sistema_nova.mvc.model.service;

import br.com.sistema_nova.mvc.model.Pedido;
import br.com.sistema_nova.mvc.model.repository.PedidoRepository;
import br.com.sistema_nova.mvc.model.repository.ClienteRepository;
import br.com.sistema_nova.mvc.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public Pedido criarPedido(Pedido pedido) {
        if (clienteRepository.existsById(pedido.getCliente().getId()) &&
            pedido.getProdutos().stream().allMatch(produto -> produtoRepository.existsById(produto.getId()))) {
            // Lógica para validar estoque e calcular valor total do pedido
            // ...existing code...
            return pedidoRepository.save(pedido);
        } else {
            throw new IllegalArgumentException("Cliente ou Produto não encontrado");
        }
    }

    public Pedido obterPedido(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}