package exerciciosarrays;
	//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

import java.util.Scanner;


public class Matriztresatres {
	
public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int[] [] matriz = new int [3][3];
		int maiorquedez=0;
	
	
		for(int linha=0;linha<3;linha++) {
			for(int coluna=0;coluna<3;coluna++) {
				System.out.println("insira valores para Matriz[3][3]");
				matriz[linha][coluna]=leia.nextInt();
				
			
		if (matriz[linha][coluna]>10) 
		{
			maiorquedez++;		
		}
		}
		}System.out.printf("\nquantos valores são maiores que dez %d",maiorquedez);
	
	}
	
}
