package exercicios;

import java.util.Scanner;

public class notasvetor {

	
	public static void main(String[] args) {
		// G = número pra sala (g1,g2,g3) g1 - 1 = aluno
		Scanner leia = new Scanner (System.in);
		String nome;
		int matricula = 0;
		int nota [] = new int[35];
		String alunos[] = {"Alexandre Salerno","Alexsander da Silva Sousa","Aline Moreira Brilhante","Ana Flávia Porto Silva Neves","Andára Finot da Silva","arthur reis allen","Barbara dos Santos","Bruno Wesley Callachi Rocha","Dafhne Noemi da Silva Novais","David da Costa Mariano","Elielthon Soares de Souza","Erika Rosany de Almeida Lima","Fabricio Siqueira Macedo","Fernando Salomão Constancio","Giovanna Cirillo Torres","Guilherme Mendes Carvalho","Guilherme Monteiro Lopes","Isabelli Santos Silva","Israel Dantas da Silva","Jessica Yuki Toyota","Jonatas Michel de Cardoso Vieira","José Luis Correia dos Santos","Juliana Brito Favero Ribeiro","Lorrans Matildes Facca","Lucas Teodoro de Sousa","Maria Luísa Maricato","Mateus Rosendo Firmino de Oliveira","Matheus de Souza Barbosa","Nathalia Beatriz Silva Pereira","Pedro Henrique de Azevedo Magalhães","Renato Novais da Silva","Renato Yukio Ossiama Nakamura","Robson de Jesus Vasconcelos","Tainah Vinha","Vinicius Martins Santos"};

	System.out.println("DIGITE A MATRICULA DO ALUNO PARA CADASTRO DE NOTA:" );	
		matricula= leia.nextInt(); 	
		nome = alunos [matricula];
		System.out.println();
		
		System.out.printf("Grupo 4 matricula - %d alun(e): %s" ,matricula);
		System.out.println("Digite a nota do aluno: ");
		
	}
	

}
