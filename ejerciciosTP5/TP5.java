package ejerciciosTP5;

import java.util.*;


public class TP5 {
	
	

	

	public static void main(String[] args) {
		
		String[] NombreProds = new String[3];
		int[] CantProd = new int[3];
		double[] ProdPrecio = new double[3];
		
		
		Scanner compras = new Scanner(System.in);
		
		for(int i=0;i<=NombreProds.length;i++) { 
		 System.out.println("Por favor, ingrese un producto a su carrito"); 
	     System.out.println("............................................."); 
	     System.out.println("Ingrese el nombre del producto: "); 
	     
	      NombreProds[i] = compras.next();
	     
	     System.out.println("Ingrese la cantidad a llevar del producto");
	     
	      CantProd[i] = compras.nextInt();
	     
	     System.out.println("Ingrese el precio del producto");
	     
	     ProdPrecio[i] = compras.nextDouble();
	     

		
		
	     System.out.println("cantidad " + " Precio  " + " Nombre Producto " ); 
	     
	    
		System.out.println(  CantProd[i] +"     " +"    " + ProdPrecio[i] + "      " +  NombreProds[i]);
	     
	     
		 

	}
	}
}
