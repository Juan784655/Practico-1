package Supermercado;
 
public class electronica extends Producto {
private String marca;
private String modelo;
public electronica (int precio,String producto,String marca,String modelo) { 
super(precio,producto);
this.marca=marca;
this.modelo=modelo;

}
@Override
	public String toString() {
		return ( "el producto es:"+producto+" el precio es:"+precio+" la marca es:"+marca+" el modelo es:"+ modelo);
}
}