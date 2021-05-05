package lacosdecisao;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	double numero1, numero2, numero3;
	
	System.out.println("Insira os valores: ");
	numero1 = leia.nextInt();
	numero2 = leia.nextInt();
	numero3 = leia.nextInt();

    if(numero1 >= numero2 && numero1>=numero3 && numero2>=numero3)
    {
        System.out.printf("A sequencia crescente é  %.2f %.2f %.2f ", numero3, numero2, numero1);
    }
    else if(numero1> numero2 && numero1>numero3 && numero3>numero2)
    {
        System.out.printf("A sequencia crescente é %.2f %.2f %.2f ", numero2, numero3, numero1);
    }
    else if (numero2>=numero1 && numero2>=numero3 &&numero3>=numero1)
    {
        System.out.printf("A sequencia crescente é %.2f %.2f %.2f ",numero1,numero3,numero2);
    }
    else if (numero2>= numero1 && numero2>= numero3 &&numero1>=numero3)
    {
        System.out.printf("A sequencia crescente é  %.2f %.2f %.2f ",numero3,numero1,numero2);
    }
    else if (numero3>= numero2 && numero3>= numero1 &&numero2>=numero1)
    {
        System.out.printf("A sequencia crescente é %.2f %.2f %.2f ", numero1,numero2,numero3);
    }
    else if (numero3>= numero1 && numero3>= numero2 &&numero1>=numero2)
    {
        System.out.printf("A sequencia crescente é %.2f %.2f %.2f ",numero2,numero1,numero3);
    }
leia.close();

	}
}
