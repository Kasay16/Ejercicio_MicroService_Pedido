package co.edu.unilibre.pedido.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import co.edu.unilibre.pedido.model.Inventary;
import co.edu.unilibre.pedido.model.Pedido;
import co.edu.unilibre.pedido.service.PedidoService;

@Service("pedidoServiceTemplate")
public class PedidoServiceTemplate implements PedidoService{
	@Autowired
	private RestTemplate clientRest;
	
	public List<Pedido> getAll(){
		List<Inventary> inventarys = Arrays.asList(clientRest.getForObject("http://localhost:10080/list", Inventary[].class));
		return inventarys.stream().map(prod -> new Pedido(prod, 1)).collect(Collectors.toList());
	}
	
	public Pedido findById(Long id, Integer cantidad) {
		Map<String, String> pathVariable = new HashMap<>();
		pathVariable.put("id", id.toString());
		Inventary inventary = clientRest.getForObject("http://localhost:10080/{id}", Inventary.class, pathVariable);
		return new Pedido(inventary, cantidad);
	}
}
