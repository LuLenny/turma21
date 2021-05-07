package exemplosenquanto;

import java.util.Scanner;

public class Do{
		
 public static void main (String[] args) {
	
	 Scanner leia = new Scanner (System.in);
	 
			int numero = 233;
		
		
		do
		{ 
			if(numero >= 300 && numero <=400)
			{

			System.out.printf(" + 3 = %d" ,numero);
			
			numero = numero +3;
			
			System.out.println(numero);
			}
			
			 if(numero >=233 && numero <300 || numero >400 && numero < 456)
			{
			System.out.printf(" + 5 = %d", numero);
				
			numero = numero +5;
						
		System.out.println(numero);
				}
				
			
		}
		while(numero >= 233 && numero <456); 
		{
		
			if(numero <233 || numero >456)
			{

		 	System.out.println("O numero inserido nao esta entre 233 a 456");
		
			}
		}
    }
}


