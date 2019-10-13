package co.edu.unilibre.pedido.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.unilibre.pedido.feign.InventaryServiceClientFeign;
import co.edu.unilibre.pedido.model.Inventario;
import co.edu.unilibre.pedido.model.Pedido;
import co.edu.unilibre.pedido.service1.PedidoService;

@Service("pedidoServiceFeign")
public class PedidoServiceFeign implements PedidoService{

	@Autowired
	private InventaryServiceClientFeign inventaryServiceClientFeign; 
	
	@Override
	public List<Pedido> getAll() {
		List<Inventario> inventary = inventaryServiceClientFeign.getList();
		return inventary.stream().map(prod -> new Pedido(prod, 1)).collect(Collectors.toList());
	}

	@Override
	public Pedido findById(Long id, Integer cantidad) {
		return new Pedido(inventaryServiceClientFeign.getById(id), cantidad);
	}
}