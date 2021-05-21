package programas;

import classes.Estudante;

public class Medio extends Estudante

{ 	
	double Boletim;
	int ContaBoletim;
	
	public Medio(int matricula, String cpf, double pontos, boolean status,int ContaBoletim) {
		super(matricula, cpf, pontos, status);
			
		this.ContaBoletim = ContaBoletim;
		
	}

	public int getContaBoletim() {
		return ContaBoletim;
	}

	public void setContaBoletim(int contaBoletim) {
		ContaBoletim = contaBoletim;
	}
	
	public void Boletim(double pontos) {
	

		ContaBoletim++;
	}
	
	public double getBoletim() {
		return Boletim;
	}

	public void setBoletim(double boletim) {
		Boletim = boletim;
	}

	public void ContaBoletim(int Vezes) {
	
	if (Vezes>3)
	{
		System.out.println("Você excedeu seu limite de impressão");
		
	}
	else if(Vezes<=3)
	{
		//Boletim 
	}
	
	}
	
}


/* inteiro contadorBoletim = 0
cadeia simNao = "o"
caracter incluirRetirar 
real somaPontos = 0.00
cadeia pediBoletim = "k"
inteiro vezesPb = 0
real notas [10]
caracter continuar

	para(inteiro x = 0; x < 10; x++)
            {limpa()
                escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                escreva("\nSua nota atual é: ",somaPontos)
                faca
                {
                escreva("\nVocê deseja Incluir ou Retirar nota?: ")
                escreva("\nUse I ou R: ")
                leia(incluirRetirar)
                limpa()
                escreva(NOMEDAESCOLA+"\n"+SLOGAN+"\n\nENSINO "+tipoEnsino[opcaodesejada]+"\n\nMatricula: "+matricula+"\nCPF: "+cpf+"\nMatricula: ativa\n")
                escreva("\nSua nota atual é: ",somaPontos)

                    se(incluirRetirar == 'i' ou incluirRetirar == 'I')
                    {
                        escreva("\nInsira o valor que deseja incluir: ")
                        leia(notas[x])
                        somaPontos += notas[x]
                        Util.aguarde(500)
                        pare
                    }
                    senao se (incluirRetirar == 'r' ou incluirRetirar == 'R')
                    {
                        escreva("Insira o valor que deseja Retirar: ")
                        leia(notas[x])
                        somaPontos -= notas[x]
                            se(somaPontos <= 0.0)
                            {
                                somaPontos = 0.0
                                escreva("Sua nota zerou!")
                                Util.aguarde(500)
                                pare
                            }
                            senao
                            {
                                pare
                            }
                    }

                }
                enquanto(incluirRetirar !='I' e incluirRetirar !='i' ou incluirRetirar !='S' e incluirRetirar !='s')
			escreva("\nDeseja continuar?: ")
                leia(continuar)

                faca{
                    se(continuar == 'n' ou continuar == 'N')
                    {
                    	faca{
                    	escreva("\ndeseja imprimir seu boletim?")
                    leia(pediBoletim) 
                    	se(pediBoletim=="sim")
                    
                    	{contadorBoletim++ 
                    	se(contadorBoletim<3){
                    		   
                    	
                    	para(inteiro z=0;z<1; z++)
                    		{
                    		para(inteiro y=0;y<10;y++){
                    		escreva( notas[y],"  ")	
                    		}
                    			
                    		}
                    		
                    		x+=10
                    	Util.aguarde(5000)
                    	}
                    	}
                    	senao{x+=10
                    		pare
                    	
                    	}
                    	pare
                    	}
                    	enquanto(contadorBoletim<=3)
                    	pare}
                    

                    senao se(continuar == 's' ou continuar =='S')
                    {
                        pare
                    }
                    senao
                    {
                    escreva("Por favor insira um valor valido!\nDeseja continuar?: S/N ")
                    leia(continuar)
                    }
                    }
                    enquanto(continuar !='n' ou continuar !='N')
                    }pare			
			}			*/