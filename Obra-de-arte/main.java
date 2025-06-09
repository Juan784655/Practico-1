package arte;
import java.util.Scanner;
public class main {
	
	public class Main {
		public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);

			System.out.println("ingresa el nombre de la pintura:");
		    String nombrePintu = scanner.next();
			System.out.println("ingresa el autor de la pintura:");
			String autorPintu= scanner.next();
			System.out.println("ingresa el año de la pintura:");
		    int añoPintu = scanner.nextInt();
			System.out.println("ingresa el estado de la pintura:");
		    String estado = scanner.next();
		    System.out.println("ingresa la tecnica de la pintura:");
		    String tecnica = scanner.next();
		    
		    pintura pintura1 = new pintura(nombrePintu,autorPintu,añoPintu,estado,tecnica);
		    
		   
		    System.out.println("Ingrese el nombre de la escultura:");
		    String nombreEscultu = scanner.next();
		    System.out.println("Ingrese el autor de la escultura:");
		    String autorEscultu = scanner.next();
		    System.out.println("ingresa de que año es la escultura:");
		    int añoEscultu = scanner.nextInt();
		    System.out.println("ingresa cual es su inspiracion de la escultura:");
		    String inspiracion  = scanner.next();
		    System.out.println("ingresa el tamaño de la escultura:");
		    String tamaño = scanner.next();
		    
		    escultura escultura1 = new escultura(nombreEscultu,autorEscultu,añoEscultu,inspiracion,tamaño);
		    
		    System.out.println("Ingrese el nombre de la fotografia:");
		    String nombreFoto = scanner.next();
			System.out.println("Ingrese el autor de la fotografia:");
			String autorFoto = scanner.next();
			System.out.println("Ingrese de que año es la fotografia:");
		    int añoFoto = scanner.nextInt();
		    System.out.println("ingresa el angulo de la fotografia:");
		    String angulo = scanner.next();
		    
		    fotografia fotografia1 = new fotografia(nombreFoto,autorFoto,añoFoto,angulo);

		    System.out.println("Info de las obras de arte:");
		    System.out.println("|Pintura: " + "|Nombre:" + nombrePintu+"|"+ "|Autor:" + autorPintu+"|" +"| Año:" + añoPintu+"|" + "|estado :" + estado+"|" + "|tecnica:" + tecnica+"|");
		    System.out.println("|Escultura: " + "|Nombre:" + nombreEscultu+"|" + "|Autor:" + nombreEscultu+"|"+ "|Año:" + añoEscultu+"|" + "|inspiracion:"+ inspiracion+"|" + "|tamaño: "+ tamaño+"|");
		    		 System.out.println(  "|Fotografia: " + "|Nombre:"+ nombreFoto+"|" + "|Autor:"+ autorFoto+"|" + "|Año:"+ añoFoto+"|" + "|angulo:" + angulo+"|" );
			}

		}
}
