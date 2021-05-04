package exercicios;

import java.util.Scanner;

public class Identficação {
	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
			
			
 
	String nome= "";
	int anonascimento;
	char genero= ' ';
	int idade;
	
	System.out.println("qual seu genero");
	genero=leia.next().charAt(0);
	
	
	System.out.println("insira seu nome: ");
	nome = leia.nextLine();
	
	// %s - string
	// %d - int
	// %.2f - double
	// %c - char
	
	System.out.println("Insira seu ano de nascimento: ");
	anonascimento = leia.nextInt();
	idade = 2021-anonascimento ;
	System.out.printf("Seu nome é: %s\n sua idade é: %d\n e você se identifica como: %c",nome,idade,genero);		
	}

}
