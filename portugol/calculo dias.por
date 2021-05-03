programa
{
	
	funcao inicio()
	{
	//nome objetivo
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
		*/
	//entradas
		inteiro idade
		inteiro dias
		inteiro ano
		inteiro meses
		
					escreva("Quantos dias você viveu? ")
					leia (idade)

	//processamentos
      ano = (idade / 365)
    meses = (idade / 30) 
	dias = (idade / 1) 
	
	//saídas
	  		escreva("ano(s): "+ano+"\n")
        		escreva("mes(es): "+meses+"\n")
        		escreva("dia(s): "+dias+"\n")
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */