programa
{
	
	funcao inicio()
	{
	cadeia time [3]
	caracter V, D, E 
	inteiro vitorias = 0
	inteiro pontuacao [3]
	inteiro derrotas = 0 
	inteiro empates = 0
	 
		para (inteiro x=0;x<3;x++)
		{	

		escreva("insira nome do time aqui: ")

		leia(time[x])
		
		escreva("vitoria, empate ou derrota? ")
		leia(V,D,E)
	
		}
		
		para (inteiro x=0;x<3;x++){
		
		
		 

		escreva(time [x], "teve" ,V, "gols" ,D, "perdas" ,E, "empates")

		escreva("\t \n", pontuacao [x], vitorias = V, derrotas = D, empates = E)
		
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 433; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */