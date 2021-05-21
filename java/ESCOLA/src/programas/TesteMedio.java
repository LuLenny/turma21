package programas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class TesteMedio {

	public static void main(String[] args) {
	Collection<Double> boletim = new ArrayList();
	char op = ' ' ;
	
		Scanner leia = new Scanner (System.in);
		Medio medio = new Medio(0, null, 0, false, 0);	
			
		
		
		//pegar a nota
	
	for(int x=0; x<10; x++) 
	{
		System.out.println("deseja adicionar ou retirar?");
		op=leia.next().toUpperCase().charAt(0);
		if (op == 'S')
		{
				
		
		
		System.out.println("insira nota");
		
		double adicionarPonto=leia.nextDouble();
		
		medio.adicionarNota(adicionarPonto);
		medio.getPontos();
		
		System.out.println(medio.getPontos()); 
		boletim.add(medio.getPontos()); 
	}
		else 
		{
			System.out.println("insira nota");
			
			medio.tirarNota(medio.getPontos());
			
			boletim.remove(medio.getPontos());
			System.out.println(-medio.getPontos()); 
			 	
		}
		System.out.println("seu boletim:"+boletim);
		
		
		
	}
	
	
	}
	

}
