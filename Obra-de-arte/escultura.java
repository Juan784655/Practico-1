package arte;

public class escultura  extends obraDeArte{
	
	  String tamaño;
	  String inpiracion;
	  
	 public escultura(String nombre,String autor,int año,String tamaño,String inpiracion) {
		super(nombre,autor,año);
		 this.tamaño = tamaño;
	     this.inpiracion = inpiracion;
	  
	     
	 }
}


