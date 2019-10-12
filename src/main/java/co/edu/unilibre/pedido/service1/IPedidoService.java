package co.edu.unilibre.pedido.service;

import java.util.List;

import co.edu.unilibre.pedido.model.Pedido;

public interface IPedidoService {
	public List<Pedido> getAllList();
	public Pedido getById(Long id);
	public Pedido findById(Long id, Integer cantidad);
}