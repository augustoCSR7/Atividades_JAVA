//Questão 1. c)
package personagens;

import interface_comportamentos.ComportamentoFeroz;

public class Dragão extends Personagem implements ComportamentoFeroz
{
	public Dragão(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar()
	{
		System.out.println(" O Dragao " + this.getNome() + " esta andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("O Dragao " + this.getNome() + " esta guardando um tesouro.");
	}

	@Override
	public void usarItem() 
	{
		System.out.println(" O Dragao " + this.getNome() + " esta usando tesouro como isca.");
	}

	@Override
	public void atirarFogo() 
	{
		System.out.println("O Dragao " + this.getNome() + " esta cuspindo fogo nos seus inimigos.");
	}

	@Override
	public void voar() 
	{
		System.out.println("O Dragao " + this.getNome() + " esta voando.");
	}

	@Override
	public void morder() 
	{
		System.out.println("O Dragao " + this.getNome() + " esta abocanhando seus inimigos.");
	}
}
