package packote;

import java.util.Scanner;

public class Cadastroclientes {
	
	
	public static void main(String[] args) {
Scanner leia = new Scanner (System.in);
 char respostavivo= 'v'/'m';	
Cadclient cliente = new Cadclient();


		System.out.println("Insira a seguir o seu nome: ");
		cliente.nome=leia.next();
	 
	 System.out.println("Como Você se identifica? ");
	 cliente.genero=leia.next().toUpperCase().charAt(0);
		System.out.println("Você está vivo ou morto?(V/M");
		respostavivo=leia.next().toUpperCase().charAt(respostavivo);
		
		if(respostavivo == 'v');
		
	 
	}

}
