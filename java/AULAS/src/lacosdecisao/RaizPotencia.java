package lacosdecisao;
import java.util.Scanner;

public class RaizPotencia {
  
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double numero;
		
		System.out.println("insira um numero ao final se for par ser� exibida sua raiz quadrada se for impar ser� ao quadrado");
		numero = leia.nextDouble();
		
		
		if ((numero%2)==0)
		{
		System.out.println(numero = Math.sqrt(numero));	
		}	
		else
		{
		System.out.println(numero = Math.pow(numero, 2));
		}
	}

}
