package lacosdecisao;

import java.util.Scanner;

public class QualoMaior {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int  entrada1, entrada2, entrada3;	
	
	
	System.out.println("Insira os valores: ");
	entrada1 = leia.nextInt();
	entrada2 = leia.nextInt();
	entrada3 = leia.nextInt();
	
	
	if (entrada1>entrada2&&entrada1>entrada3) 	
	{
	System.out.printf("O maior valor é: %d", entrada1 );	
	}
	else if (entrada2>entrada1&&entrada2>entrada3) 	
	{
	System.out.printf("O Maior Valor é : %d", entrada2);	
	}
	else
	{
		System.out.printf("O Maior valor é: %d", entrada3);
	}
	}
}
