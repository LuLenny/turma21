programa
{	/* 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO. */
	 
	funcao inicio()
	{
 //variaveis
	inteiro P, E = 0	
	inteiro M

		
 //entradas
  		escreva("Insira peso do tomate: ")
  		leia (P)
			


 //processamento 
	se (P > 50)  		
				
	{ 	E = (P-50)
		escreva("valor excedente: " , (E), "kg",  "\n")
		escreva("o valor do tomate esta acima do permitido você sofrerá uma multa de R$ ", M = (P-50)*4, "\n")
			escreva("fim do programa")	
		}
		senao {
		escreva("o valor está dentro do limite permitido \n")		 	
 			escreva("fim do programa")	
}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 773; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */