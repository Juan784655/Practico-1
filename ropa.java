package Supermercado;
 

	public class ropa extends Producto {
		private String color;
		private String tamaño;
		public ropa (int precio,String producto,String tamaño,String color) { 
		super(precio,producto);
		this.tamaño=tamaño;
		this.color=color;

		}
		@Override
			public String toString() {
				return (" el producto es: "+producto+"el precio es:"+precio+" el tamaño es:+"+tamaño+" el color es:"+ color);
		}
		}
