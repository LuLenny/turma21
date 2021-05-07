package exerciciosenquanto;

import java.util.Scanner;

public class dezparesimpares{

	public static void main(String[] args) {

	 	Scanner leia = new Scanner(System.in);
		 int num;
		int par=0;
		int impar=0;
		  		
		for (int x=1;x<=10;x++)
		 { 
		  System.out.println("\ninsira os valores: ");		 		
		  num = leia.nextInt();
		if((num%2)==0) 
		{	 
		 par++;
		 }
		
		else
		{ 
		impar++;
		}	
		 
		 } System.out.printf("\nQuantos são Numeros pares: %d",par); 

		 System.out.printf("\nQuantos são Numeros Impares: %d",impar);
	}
}