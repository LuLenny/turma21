package exercicios;

import java.util.Scanner;

public class Calculodias {
	public static void main(String[] args) {
	 
	Scanner leia = new Scanner(System.in);
	int idade;
	int dias;
	int ano;
	int meses;
	
	System.out.println("Quantos dias você viveu? ");
    idade=leia.nextInt();
		
    
    		ano = (idade / 365);
    	    meses = ((idade%365) / 30); 
    		dias = ((idade%365) % 30);
    		
    		System.out.println("ano(s): "+ano);
    		System.out.println("mes(es): "+meses);
    		System.out.println("dia(s): "+dias);
	}

}
