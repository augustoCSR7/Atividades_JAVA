//Questão 2.
package interface_usuario;
import java.util.ArrayList;

import personagens.*;

public class Jogo 
{
	public Jogo() {}

	public void ControlarAcoesDosPersonagens(ArrayList<Personagem> personagens)
	{
		for (int i = 0; i < personagens.size(); i++)
		{
			personagens.get(i).andar();
			personagens.get(i).guardarItem();
			personagens.get(i).usarItem();
			System.out.println("--------------------------------------------------");
		}
	}
}
