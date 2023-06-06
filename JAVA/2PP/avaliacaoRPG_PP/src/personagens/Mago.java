//Questão 1. c)
package personagens;

import interface_comportamentos.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico
{
	public Mago(String nome) 
	{
		super(nome);
	}

	@Override
	public void andar() 
	{
		System.out.println("O Mago " + this.getNome() + " esta andando.");
	}

	@Override
	public void guardarItem() 
	{
		System.out.println("O Mago " + this.getNome() + " esta guardando um cajado.");
	}
	
	public void usarItem() 
	{
		System.out.println("O Mago " + this.getNome() + " esta usando uma pocao de cura.");
	}

	public void invisibilidade() 
	{
		System.out.println(" O Mago " + this.getNome() + " esta invisivel.");
	}

	public void ultraRapidez() 
	{
		System.out.println(" O Mago " + this.getNome() + " esta correndo na velocidade da luz.");
	}
}
