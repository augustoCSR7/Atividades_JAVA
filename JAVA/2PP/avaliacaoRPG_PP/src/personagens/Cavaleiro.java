//Questão 1. c)
package personagens;

import interface_comportamentos.*;

public class Cavaleiro extends Personagem implements ComportamentoHeroico
{
	public Cavaleiro(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta guardando uma espada de diamante.");
	}

	@Override
	public void usarItem() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta usando uma escudo.");
	}

	@Override
	public void atacar() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta atacando um inimigo.");
	}

	@Override
	public void defender() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta se defendendo de um ataque.");
	}

	@Override
	public void saltar() 
	{
		System.out.println("O Cavaleiro " + this.getNome() + " esta saltando.");
	}
}
