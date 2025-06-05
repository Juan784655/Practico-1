package Supermercado;

public abstract class Producto {
protected int  precio;
protected String producto; 
	public Producto (int pecio,String producto) {
this.precio=precio;
this.producto=producto;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String gProducto() {
		return producto;
	}
	public void setProducto(String nombre) {
		this.producto = producto;
	}

}
