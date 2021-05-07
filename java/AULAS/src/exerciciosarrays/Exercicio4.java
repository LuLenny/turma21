package exerciciosarrays;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String []args) {
		Scanner leia= new Scanner(System.in);
	double mat[][] = new double [2][2];
	double mat2[][] = new double [2][2];	
	double mat3[][] = new double [2][2];
	double mat4[][] = new double [2][2];	
	char opcao;
	
	
	System.out.println("Insira os valores da matriz: ");
	
	for(int linha=0; linha<2; linha++) 
	{
		for(int coluna=0; coluna<2; coluna++) {
			
		
		mat[linha][coluna]=leia.nextDouble();
		}
	}
		System.out.println("insira os valores da segunda matriz: ");
	for(int linha=0; linha<2; linha++) 
	{
		for(int coluna=0; coluna<2; coluna++) 
		{
			mat2[linha][coluna]=leia.nextDouble();
		}
		
		
	}
	
	do {
		System.out.println("Selecione a Opção 1 caso queira Somar as matrizes\n1- 2 caso queira subtrair entre elas\n2 3 caso queira adicionar uma constante\n3 4 imprimir os resultados");
		opcao=leia.next().toUpperCase().charAt(0);
	if(opcao=='1')
	{
		System.out.println("soma: ");
	 
		for(int linha=0; linha<2; linha++) {
			
			System.out.print("\t");
			for(int coluna=0; coluna<2; coluna++) {
				mat3[linha][coluna]= mat[linha][coluna]+mat2[linha][coluna];
				System.out.print(mat3[linha][coluna]+"\t");
				
				
	}
			System.out.print("]");
			System.out.print("\n");
		
	}
		
		
	}
	else if (opcao=='2') 
	{
		System.out.println("Subtração: ");
		for(int linha=0;linha<2;linha++) 
		{
			System.out.print("\t");
		for(int coluna=0; coluna<2; coluna++)
		{
			mat4[linha][coluna]= mat[linha][coluna]-mat2[linha][coluna];
			System.out.print(mat4[linha][coluna]+"\t");
			
	}
			System.out.print("]");
			System.out.print("\n");
	}
	}
		
		else if(opcao=='3') {
			System.out.print("Quanto será sua constante? ");
			final double CONSTA=leia.nextDouble();
			for(int linha=0; linha<2; linha++) 
			{
				
			
			 for(int coluna=0; coluna<2; coluna++) 
			 {
				
				mat[linha][coluna]+=CONSTA;
				mat2[linha][coluna]+=CONSTA;
				
	}
	}
	}
		else if (opcao=='4') 
		{
			System.out.println("Matriz1: ");
			for(int linha=0; linha <2; linha++) 
			{
				System.out.print("[");
				
				for(int coluna=0;coluna<2;coluna++) 
				{
					System.out.print(mat[linha][coluna]+ " ");
				
				
				
	 }
				System.out.print("]");
				System.out.print("\n");
			}
			System.out.println("\nMatriz2: ");
			for(int linha=0; linha<2; linha++) 
			{ System.out.print("[");
				for(int coluna=0; coluna<2; coluna++) 
			 { 
				System.out.print(mat2[linha][coluna]+" ");
			 }
				System.out.print("]");	
				System.out.print("\n");
			}
			System.out.println("\nmatriz3 ");
			 for(int linha=0; linha<2; linha++) 
			 { System.out.print("[");
				 for(int coluna=0; coluna<2; coluna++) 
				 {
					 System.out.print(mat3[linha][coluna]+" ");
				 }
				 System.out.print("]");
				 System.out.print("\n"); 
			}
			 	System.out.println("\nmatri4: ");
			 	 for(int linha=0; linha<2; linha++) 
				 {
			 		 System.out.print("[");
			 		 for(int coluna=0; coluna<2; coluna++) 
					 {
			 			 System.out.print(mat4[linha][coluna]+" ");
					 }
				 System.out.print("]");
				 System.out.print("\n");
				 }
			 	 break;
		}
	}
 while(opcao<1 || opcao>4);

}
}