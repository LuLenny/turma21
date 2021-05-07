package exerciciosenquanto;
/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
import java.util.Scanner;

public class IdadeWhile {
 public static void main (String[] args) {
	 Scanner leia = new Scanner (System.in);
	 int idade=0;
	 int dados=0;
	 int dados50=0;
	
	 while (idade != -99) {

		
		System.out.println("Por Favor entre com seus dados: ");
	 idade = leia.nextInt();
	
	 if(idade<21)	
	 {

		 dados++;
		 
		 
	 
		 
	 }
	 if (idade>50)
	 {
		dados50++;
		

	 }	
	 
	 }
	  
	  System.out.printf("\nEste é o total de pessoas com mais de 50: %d", dados50);
	 
		 System.out.printf("\nEste é o total de pessoas com menos de 21: %d", dados);
	 
 }
 
}
