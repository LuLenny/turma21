package exerciciosarrays;
/*2- Fa�a um programa que receba 6 n�meros inteiros e mostre:
� Os n�meros pares digitados;
� A soma dos n�meros pares digitados;
� Os n�meros �mpares digitados;
� A quantidade de n�meros �mpares digitados.*/
import java.util.Scanner;

public class SeispareSeisimpares {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numeros [] = new int[6];
		int imparesquant=0;
		int parapar=0;
		for(int x=0; x<6; x++) 
		{
		System.out.println("insira um valor para cada movimento: ");
		numeros[x]= leia.nextInt();
		}
		for(int x=0; x<6; x++) 
		{
		if((numeros[x]%2)==0) 
		{	
			System.out.printf("\ns�o pares: %d",numeros[x] );
				
		}
		else {
			System.out.printf("\ns�o impares: %d", numeros[x]);
		
			imparesquant++;
		
		
		}
		System.out.printf("\nquantidade de impares: %d" ,imparesquant);
		 System.out.printf("\nsomados s�o: %d", parapar += numeros[x]);}
		}
		
		{
			
		
	}
	

}
