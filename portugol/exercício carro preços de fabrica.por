programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
	/* 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
 */
//variaveis

  	const real pdistribuidor = 0.28 //28%
  	const real pimposto =  0.45 //45%

  	
   real custoConsumidor= 0.00
   real custoFabrica= 0.00
   real percentagemDistribuidor= 0.00
   real impostos = 0.00	
		
//entradadas
	escreva("digite o custo de fabrica do carro : R$ ")
	leia(custoFabrica)
	
//processamento	
	percentagemDistribuidor = mat.arredondar ((custoFabrica * pdistribuidor),2)	
	impostos = custoFabrica * pimposto
	custoConsumidor = custoFabrica + percentagemDistribuidor + impostos

//saida
	escreva("Tedcar carros podres e nojentos por preços piores")
	escreva("Preço do carro : R$ ",custoFabrica,"\n")
	escreva("Distribuidor   : R$ ",percentagemDistribuidor,"\n")
	escreva("Custo Consumidor : R$ ",custoConsumidor,"\n")
		
		
		
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 804; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */