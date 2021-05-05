package lacosdecisao;

import java.util.Scanner;

public class IdadeClassifica {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	
		int idade;
	
	System.out.println("Insira a sua idade: ");
	 idade = leia.nextInt();
	
	
	if(idade < 15 )
	{ 
		System.out.println("Faixa Etária: Infantil");
		
		
	}
	
	if(idade<18&& idade>14)
	{ System.out.println("Faixa Etária: Juvenil"); 
		
	}
	else if (idade>18)
	{
		System.out.println("Faixa Etária: Adulto");
		
	}
	
	}
	

}
