programa /*1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.?*/
{
	
	funcao inicio()
	{
	real pont [5]
	cadeia ativ [5] 
	real maiorPont = 0.00
		para (inteiro x=0;x<5;x++){	
		escreva("Insira sua identificação (A, B, C, D ou E: ")
		leia(ativ[x])
		escreva("insira sua pontuação: ")
		leia(pont[x])
		}
		 
		 escreva("\n-------------------calculando resultados-------------------")

	para (inteiro x=0;x<5;x++)
	{
		se (pont[x]>maiorPont){//se for vetor x vetor vai calcular o mesmo valor
 		
 		maiorPont=pont[x]//ativou a variavel
 		
		}		
		
		escreva("\n" ,ativ[x], " sua pontuação foi de " ,pont [x])
	}
		
		escreva("\n a maior nota foi: " ,maiorPont)
		escreva("\n fim de programa")
		
	}

		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */