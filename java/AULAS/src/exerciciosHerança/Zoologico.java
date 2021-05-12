package exerciciosHerança;

import java.util.Scanner;

public class Zoologico {

	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		System.out.println("quantos anos ele tem?: ");
		int Idade=leia.nextInt();
		System.out.println("insira seu nome: ");
		String nome=leia.next(); 
		
	
		cachorro auau = new cachorro (nome, Idade);
		auau.Som();
		
		
		
	
		System.out.println("quantos anos ele tem?: ");
		int Idade1=leia.nextInt();
		System.out.println("insira seu nome: ");
		String nome1=leia.next(); 
		
	
		cavalo pangare = new cavalo (nome1, Idade1);
		pangare.Som();
				
	
		
		System.out.println("quantos anos ele tem?: ");
		int Idade2=leia.nextInt();
		System.out.println("insira seu nome: ");
		String nome2=leia.next(); 
		
	
		preguica ted = new preguica(nome2, Idade2);
		ted.Som();
		
		
	
		
		}

}
