package exercicios;
import java.math.*;
import java.util.Scanner;

public class Exerciciocarrosfabrica {
	
	public static void main(String[] args) {
	
	final double pdistribuidor = 0.28;
	final double pimposto = 0.45;
	
		
	Scanner	leia = new Scanner(System.in);
	double custoconsumidor= 0.00;
	double custofabrica= 0.00;
	double percentagemdistribuidor=0.00;
	double impostos= 0.00;
	
	System.out.println("digite o custo de fabrica: R$ ");
	custofabrica=leia.nextDouble();
	
		percentagemdistribuidor = Math.round (custofabrica*pdistribuidor);
		impostos = (custofabrica*pimposto);
		custoconsumidor=custofabrica  +percentagemdistribuidor + impostos;
		
	//saida
		
		System.out.println("Tedcar carros podres e nojentos por preços piores");
		System.out.println("Preço do carro : R$ "+custofabrica);		
		System.out.println("Distribuidor   : R$ "+percentagemdistribuidor);
		System.out.println("Custo Consumidor : R$ "+custoconsumidor);	
		
	}

}
