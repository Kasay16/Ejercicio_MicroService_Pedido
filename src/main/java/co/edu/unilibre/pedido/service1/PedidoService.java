package co.edu.unilibre.pedido.service;

import java.util.List;

import co.edu.unilibre.pedido.model.Pedido;

public interface PedidoService {
	public List<Pedido> getAll();
	public Pedido findById(Long id, Integer cantidad);
}