package exemplos;

import java.util.Locale;
import java.util.Scanner;

public class ExemploSe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		int numero;
		
		System.out.print("Digite Um n�mero inteiro: ");
		numero = leia.nextInt();
		
		/*se ((numero%2) == 0){
		*escreva("Numero Par")
		*
		*}
		*/
		if (numero == 0) {
			System.out.println("O N�mero � Zero...");
		}
		else if(numero<0) {
			System.out.println("Este � um N�mero negativo.");
		}
		else if ((numero%2)==0) {
			System.out.println("Este � um N�mero par!!");
		}
		else {
			System.out.println("Este � um N�mero Impar!");
		}
		
	}

}
