programa
{
	
	funcao inicio()
	{
/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
	*/

		 real Dia
		 real mes
		 real ano
   escreva("sua idade somente em anos ")
   leia(ano)
   escreva("idade somente em meses ")
   leia(mes)
   escreva("idade somente em dias ")
   leia(Dia)
   Dia = (Dia+(ano*365)+(mes*30))
   escreva("Sua idade em dias é: ",Dia)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 316; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */