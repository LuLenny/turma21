package exercicios;

import java.util.Scanner;

public class Celsiusfahrenheint {
	public static void main(String[] args) {
	String nome;
	double celsius;
	double fahrenheits;
		Scanner leia = new Scanner (System.in);
	
		System.out.println("Insira seu nome: ");
	nome=leia.next();
	
		System.out.println("Coloque a tempreatura em Celsius: ");
	celsius=leia.nextDouble();
	
			fahrenheits= (celsius *1.8) + 32;
	
		System.out.println("A temperatura é fahrenheit: "+fahrenheits);	
	}
}
