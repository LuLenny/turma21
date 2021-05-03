programa
{/*Solicitar ao final dos 10 movimentos ou ao pedido de sair se o mesmo deseja solicitar impressão do boletim, limitando em apenas 3 emissões no mês.
*/
	
	funcao inicio()
	{
	//variaveis
	inteiro contadorBoletim = 0
	cadeia pediBoletim = "k"
	inteiro vezesPb = 0
	real notas 
		para(inteiro x = 0; x<=10 ;x++)
	{	
	     
	     	escreva("\nescreva sua nota")
	     	leia(notas)
	     	se(x==10)
	     	{
		 	escreva("\nDeseja imprimir seu Boletim? sim ou não ? ")
			leia(pediBoletim)
	     	}
		se(pediBoletim=="sim")
			{
			vezesPb++
			}				
		
		se(vezesPb==3)
		
		{
		 
			escreva("\nlimite atingido")
			escreva("\nfim do prsograma")pare 
		
		}
	
			
			
			se(x==10)	
		{		
		 	
			escreva("\nDeseja imprimir seu Boletim? sim ou não ? ")
			leia (pediBoletim)
				vezesPb++
	
				 escreva("\nfim do programa")pare
		}
		
			
		
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 161; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */