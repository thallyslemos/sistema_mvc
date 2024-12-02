package br.com.sistema_nova.mvc.service;

import br.com.sistema_nova.mvc.model.Pedido;
import br.com.sistema_nova.mvc.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido criarPedido(Pedido pedido) {
        // Lógica para validar estoque e calcular valor total do pedido
        // ...existing code...
        return pedidoRepository.save(pedido);
    }

    public Pedido obterPedido(Long id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.findAll();
    }
}