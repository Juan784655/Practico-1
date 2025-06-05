package Supermercado;

import java.util.Scanner;


public class main {
    public static void main(String[] args)  {
        Scanner lector = new Scanner(System.in);

        
        System.out.println("ingrese su producto electronico:");
        System.out.print("producto: ");
        String producto1=lector.nextLine();
        System.out.print("Precio: ");
        int precio1=lector.nextInt(); 
        System.out.print("Marca: ");
        String marca=lector.nextLine();
        lector.nextLine();
        System.out.println("modelo: ");
        String modelo=lector.next();
        electronica electronica = new electronica(precio1, producto1, marca,modelo);

        System.out.println("ingrese algun Alimento:");
        System.out.print("producto: ");
        String producto2=lector.next();
     
        System.out.print("Precio: ");
        int precio2=lector.nextInt(); 
        lector.nextLine();
        System.out.print("Fecha de vencimiento: ");
        String vencimiento=lector.nextLine();
        System.out.println("apto: ");
        String sinGluten= lector.nextLine();
        alimento alimento=new alimento(precio2, producto2, vencimiento,sinGluten);

        System.out.println("ingrese la ropa:");
        System.out.print("producto: ");
        String producto3=lector.nextLine();
        System.out.print("Precio: ");
        int precio3=lector.nextInt(); 
        lector.nextLine();
        System.out.print("tamaño: ");
        String tamaño=lector.nextLine();
        System.out.println("color: ");
        String color=lector.nextLine();
        ropa ropa=new ropa(precio3, producto3, tamaño,color);

      System.out.println("--------------------------------------------------");
      System.out.println("|El producto Electrico es:"+producto1+"|"+"|El Precio es:"+precio1+"|"+"|La marca es: "+marca+"|"+"|El modelo es:"+modelo+"|");
      System.out.println("|El producto alimenticio es:"+producto2+"|"+"|El Precio es:"+precio2+"|"+"|El Vencimiento es: "+vencimiento+"|"+"|Es apto:"+sinGluten+"|");
      System.out.println("|El producto de prenda  es:"+producto3+"|"+"|El Precio es:"+precio3+"|"+"|El tamaño es: "+tamaño+"|"+"|El color es:"+color+"|");
	}

}