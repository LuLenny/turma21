programa
{ /*2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente. */
	funcao inicio(){
		
	
		//variaveis
		inteiro S = 0
		inteiro C, N = 0
		inteiro E = 0
		
		//entradas
			escreva("Quantas horas você trabalhou ? ")
			leia (N)
			S = (N * 10)
		
		//processamentos
		se (N > 50) 
	{
			E = (N-50)*20
			  escreva("seu sálario: ", S, "\n")
			  escreva("seu bonus é: ", E, "\n")
		
			
		}
		senao{
			 escreva("seu sálario: ", S, "\n" )
			escreva ("Sem bonus pra você bobão :P \n")
		}
	    //saidas
			escreva("fim do programa")
		

	
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 557; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */