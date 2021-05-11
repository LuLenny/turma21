package exerciciosclasseobjeto;

import java.util.Scanner;

import packote.Celularzinvei;

public class Celularcamelo {

	public static void main (String[]Args) {
		Scanner leia = new Scanner (System.in);
		
          Celularzinvei cel = new Celularzinvei ();
       
		
   System.out.println("Qual a sua porcentagem de bateria?: ");
		cel.bateria=leia.nextInt();
		
		
	
	 cel.BateriaExcesso();
	
	}

}

