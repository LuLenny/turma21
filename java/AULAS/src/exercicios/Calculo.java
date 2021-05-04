package exercicios;

import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int tempo;	
	int dia=0;
	int mes=0;
	int ano=0;
	
	System.out.println("Sua Idade em anos ");
	ano=leia.nextInt();
	System.out.println("Sua Idade em meses ");
	mes=leia.nextInt();
	System.out.println("Sua Idade em dias ");
	dia=leia.nextInt();
	
	tempo =(dia+(ano*365)+(mes*30));
	System.out.println("Sua idade em dias é: "+ tempo);
	}

}
