package exerciciosclasseobjeto;


import java.util.Scanner;

import packote.Atributos;

public class Exer1 {

	
	
	public static void main(String[] args) {

		Atributos Ab = new Atributos();
		Scanner leia = new Scanner(System.in);
		
	System.out.print("Seu nome:  ");
	Ab.Nomecliente=leia.next();
	System.out.printf("Olá %s insira seu Rg: ",Ab.Nomecliente);
	Ab.rg = leia.next();
	System.out.print("Agora insira seu CPF:");
	Ab.cpf = leia.next();
	
 System.out.printf("%s Cadastro existente. Aqui estão alguns dados seus:\nRg: %s\nCPF: %s", Ab.Nomecliente,Ab.rg,Ab.cpf,Ab.Numeracliente);
	Ab.cadastro();
	}
	

}
