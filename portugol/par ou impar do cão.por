programa
{/*4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.*/
	
	funcao inicio()
	{ //variaveis
		inteiro A
		
		
		//entradas 
		escreva("insira o numero: ")
			leia(A)

				se (A % 2 == 1)
			
			{escreva("O valor é ímpar \n")}
									
	
			senao
					{escreva("O valor é par \n")}

                    se (A>0) 
                    {
                    	
            escreva("O valor é positivo \n")
            escreva("fim de programa \n")}
            
           senao se (A<0) 
			{escreva("O valor é negativo \n")
				escreva("fim de programa \n")}
           senao
           {escreva("O valor e igual a 0 \n")} 
           	escreva("fim de programa")
           }
           
			

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 757; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */