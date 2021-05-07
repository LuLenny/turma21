package exerciciosenquanto;

import java.util.Scanner;

	public class Dozero {
	public static void main(String[]args) {

	
			Scanner leia = new Scanner (System.in);
	int numero = 0;
	int soma = 0;

do 
{

	System.out.println("Insira um valor : ");
	numero = leia.nextInt();
	soma+=numero;
}
		while(numero!=0);

System.out.printf("A soma dos valores é: %d",soma);
leia.close();

}
}