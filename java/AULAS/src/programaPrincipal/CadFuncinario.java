package programaPrincipal;

import classes.Funcionario;
import classes.Terceiro;

public class CadFuncionario 
{
	public static void main (String args[])
	{
		packote.Funcionario func1 = new packote.Funcionario ("1234", "Josefina");
		Terceiro terc1 = new Terceiro ("4321", "Antonio", 100);
		
		System.out.printf("Nome funcionario: %s", func1.getNome());
		System.out.printf("\nNome do funcionario Terceiro: %s\n", terc1.getNome());
		
		func1.mostrarSalario();
	}

}