package packote;

public class aviao {
	public String Turbina;
	public String Tremdepouso;
	public double peso;
	public int quantidadePessoas;
	public double comprimento;
	public double largura;
	public double combustivelDisponivel;
	public int distancia;
	public double pesoTotal = 	peso + (quantidadePessoas*70) + (combustivelDisponivel*0.785);
	
	
	public void voaounao() {

		if(pesoTotal > 321000)
		{
			System.out.println("O peso do avi�o impossibita um pouso seguro, n�o � recomendado o v�o");
		}
		else if (pesoTotal > 350000)
		{
			System.out.println("O peso total do avi�o excede os limites para uma viagem segura, informe a torre de controle e n�o decole de forma alguma!");
		}
		else 
		{
			System.out.println("O peso do avi�o est� em niveis bons ou aceitaveis, voc� pode decolar.");
		}
	}
}
