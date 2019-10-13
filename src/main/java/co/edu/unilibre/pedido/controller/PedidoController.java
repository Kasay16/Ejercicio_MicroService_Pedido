package co.edu.unilibre.pedido.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unilibre.pedido.model.Pedido;
import co.edu.unilibre.pedido.service.PedidoService;

@RestController
public class PedidoController {
	
	@Autowired(required = true)
	@Qualifier("pedidoServiceFeign")
	private PedidoService pedidoService;
	
	@GetMapping("/list")
	public List<Pedido> getAll(){
		return pedidoService.getAll();
	}
	
	@GetMapping("/{id}/{cantidad}")
	public Pedido getById(@PathVariable Long id, @PathVariable Integer cantidad) {
		return pedidoService.findById(id, cantidad);
	}
}