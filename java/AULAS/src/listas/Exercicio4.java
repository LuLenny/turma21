package listas;

import java.util.Scanner;

public class Exercicio4 {
	
	
	public static void main(String[] args) {
	
	Scanner leia = new Scanner(System.in);
	
	double a;
	double b;
	double c;
	double D;
	double R;
	double S;
	
	System.out.println("informe o Valor de A");
	a=leia.nextDouble();
	System.out.println("informe o Valor de B");
	b=leia.nextDouble();
	
	R = (a+b) * (a+b);
	System.out.println("O valor de R é "+ R);
	System.out.println("insira o valor de C ");
	c=leia.nextDouble();
	S= (b+c) * (b+c);
	System.out.println("o valor de s é "+ S);
	D=(R+S) /2;
	System.out.println("D é igual a:"+ D);
	
	}
	
}
