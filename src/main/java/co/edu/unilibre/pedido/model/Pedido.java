package co.edu.unilibre.pedido.model;

public class Pedido {
	private Inventary inventary;
	private Integer cantidad;

	
	public Pedido(Inventary inventary, Integer cantidad) {
		super();
		this.inventary = inventary;
		this.cantidad = cantidad;
	}

	public Inventary getInventary() {
		return inventary;
	}

	public void setInventary(Inventary inventary) {
		this.inventary = inventary;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}