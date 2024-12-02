package br.com.sistema_nova.mvc.controller;

import br.com.sistema_nova.mvc.model.Pedido;
import br.com.sistema_nova.mvc.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/novo")
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping("/{id}")
    public Pedido obterPedido(@PathVariable Long id) {
        return pedidoService.obterPedido(id);
    }

    @GetMapping
    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }
}