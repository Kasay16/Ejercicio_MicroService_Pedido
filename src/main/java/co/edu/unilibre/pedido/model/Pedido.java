package co.edu.unilibre.pedido.model;

public class Pedido {
	private Inventario inventary;
	private Integer cantidad;

	
	public Pedido(Inventario inventary, Integer cantidad) {
		super();
		this.inventary = inventary;
		this.cantidad = cantidad;
	}

	public Inventario getInventary() {
		return inventary;
	}

	public void setInventary(Inventario inventary) {
		this.inventary = inventary;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}