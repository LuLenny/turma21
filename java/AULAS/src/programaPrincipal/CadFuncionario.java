package programaPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import packote.Funcionario;
import packote.Terceiro;

public class CadFuncionario
	{
	public static void main (String args[])
	{	
		List<Funcionario>Lista = new ArrayList<>();
		
		
		Scanner leia = new Scanner (System.in);
	
		
		System.out.println("cadastro de funcionarios");
		System.out.println("Digite a quantidade de funcionarios a ser cadastrada: ");
		int qtde=leia.nextInt();
		
	
		
		for(int x=1; x<=qtde; x++)
		{
			System.out.println("Digite 1- funcionario 2 funcionario Terceirizado");
			char op = leia.next().charAt(0);
		System.out.println("nome do Funcionaro: \n");
		String nome = leia.next().toUpperCase();
		System.out.println("digite a matricula");
		String matricula = leia.next().toUpperCase();	
		System.out.println("horas trabalhadas: ");
		int horasTrabalhadas = leia.nextInt();
		System.out.println("Digite o valor por hora:  R$ ");
		double valorHora = leia.nextDouble();
		if(op=='2') 
		{
			System.out.println("Qual o valor Adicional: R$ ");
			double adicional = leia.nextDouble();
		Lista.add(new Terceiro(nome,matricula,horasTrabalhadas,adicional));
		}
		else {
			Lista.add(new Funcionario(nome,matricula,horasTrabalhadas, valorHora));
		}
		
		
	}
	System.out.println(Lista.size());
	
	System.out.println();
	System.out.println("FOLHA DE PAGAMENTOS");
	
	//for each
	for(Funcionario func: Lista) {
		System.out.println(func.getNome()+" seu salario é R$ "+func.salario());
	}

		}
	
	
	
	}
	

}

/*String matricula;
		int	horasTrabalhadas;
		double valorHora;
		String nome;
		
		
		//packote.Funcionario func1 = new packote.Funcionario ("1234", "Josefina");
	
		Terceiro terc1 = new Terceiro ("4321", 8, 50, "José", 50);

		
		System.out.printf("Nome do Terceiro: \n", terc1.getNome());
		terc1.mostrarSalario();*/

//Funcionario Func1= new Funcionario (matricula,horasTrabalhadas,valorHora,nome);
