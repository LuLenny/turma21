package exerciciosarrays;
/*2- Faça um programa que receba 6 números inteiros e mostre:
• Os números pares digitados;
• A soma dos números pares digitados;
• Os números ímpares digitados;
• A quantidade de números ímpares digitados.*/
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
			System.out.printf("\nsão pares: %d",numeros[x] );
				
		}
		else {
			System.out.printf("\nsão impares: %d", numeros[x]);
		
			imparesquant++;
		
		
		}
		System.out.printf("\nquantidade de impares: %d" ,imparesquant);
		 System.out.printf("\nsomados são: %d", parapar += numeros[x]);}
		}
		
		{
			
		
	}
	

}
