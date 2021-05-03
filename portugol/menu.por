programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		caracter opcao
		
		faca{
			escreva("digite o codigo de sua opção \n")
			escreva("\n1-Basico\n2-Medio\n3-Graduação\n4-Sair: \n")
			leia(opcao)
			se (opcao == '1'){
				limpa()
				escreva("\nENSINO BASICO\n")
				Util.aguarde(100)
					
		
			}
			senao se(opcao == '2'){
				limpa()
				escreva("\nENSINO MÉDIO")
				
			}
			senao se(opcao == '3'){
					limpa()
				escreva("\nGRADUAÇÃO")
				
			}	
					
		}enquanto	(opcao !='4')
			escreva("fim do programa!")
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 191; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */