programa
{
	inclua biblioteca Util/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{	
	inteiro mat [3] [3]	
	inteiro soma = 0
	inteiro somaDiagonal= 0

		para(inteiro x= 0; x < 3; x++){
			para(inteiro y = 0; y <3; y++){
					mat [x][y]=Util.sorteia(1,6)	
					escreva("\n", "\t", mat[x][y])
					
					soma += mat [x][y]
				se(x == y){
					somaDiagonal+=mat [x] [y]
				escreva ("\t", "\n", somaDiagonal)
				
				}
				
				
			}
			
		}
							

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 490; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */