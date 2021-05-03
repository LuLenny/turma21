programa
{ /*Demanda:
-Pedir o nome do usuário 
-Como se identifica (Masc. Femin. Outro)
-Pedir ano de nascimento
Regra:
-Até 18 anos, jovem
-Acima de 18 até 50, adulto(a)
-Acima de 50, idoso(a)
Para mulher idosa, para homem idoso, para outro idose
Adulta, adulto, adulte
*/
	
	funcao inicio()
	{
		inteiro dataNascimento
		cadeia nome // "  "
		caracter genero // ' ' 
	//entradas
		escreva("qual o seu nome? : ")
			leia (nome)	
	 	escreva ("como se identifica? :")		
			leia (genero)
		escreva ("idade? :")
			leia (dataNascimento)
	//processamento
		se ((dataNascimento) >= 2003)
		
		{
			escreva("jovem")
		
		}
		senao se ((dataNascimento) >= 1972){
			escreva("adulto")
		}
		senao se ((dataNascimento) < 1972) 
		{
			escreva("idoso")	 		
		}
		
			 
	
	
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 754; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */