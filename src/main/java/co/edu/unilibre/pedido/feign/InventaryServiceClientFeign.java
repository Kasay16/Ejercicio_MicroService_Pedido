package co.edu.unilibre.pedido.feign;

import java.util.List;

import org.springframework.ccloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.edu.unilibre.pedido.model.Inventario;

@FeignClient (name = "inventary-service", url = "localhost:10010")
public interface InventaryServiceClientFeign {
	
	@GetMapping("/list")
	public List<Inventario> getList();
	
	@GetMapping("/{id}")
	public Inventario getById(@PathVariable Long id);
}