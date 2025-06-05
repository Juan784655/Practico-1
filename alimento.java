package Supermercado;

public class alimento extends Producto {
	private String vencimiento;
	private String sinGluten;
	public alimento (int precio,String producto,String vencimiento,String sinGluten) { 
	super(precio,producto);
	this.vencimiento=vencimiento;
	this.sinGluten=sinGluten;

	}
	@Override
		public String toString() {
			return (" el producto es:"+producto+" el precio es:"+precio+" se vence en: "+vencimiento+" apto para celiacos: "+ sinGluten);
	}
	}

