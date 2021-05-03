programa
{/*nome de 5 alunos
5 alunes
nome, nota
media de notas
maior nota
From Ednilson Nascimento Martiniano to Everyone:  09:52 AM
quantos alunos tiveram nota menor ou igual a 5*/
	
	funcao inicio()
	{
		
		real menorNota= 0.00
		real mediaNota=0.00, maiorNota = 0.00
		real nota=0.00
		cadeia  nome
		real somaNota = 0.00

		para(inteiro contador = 1; contador <= 5; contador++)
		{

			escreva("Digite o nome ")
			leia(nome)
			escreva("insira aqui sua nota: ")		
			leia(nota)
			
			somaNota+=nota //somaNota = somaNota +nota
			se(nota > maiorNota)
			{
				maiorNota= nota
				
			}
		}
		se(menorNota < nota){
		menorNota= nota	
		mediaNota = somaNota / 5
		
		escreva("Maior nota é: " , maiorNota)
		escreva("\na média é de: " , mediaNota)
		escreva("\nMenor nota é: " , menorNota)  
		                     }
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 590; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */