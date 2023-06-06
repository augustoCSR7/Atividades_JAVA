package interface_usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import personagens.*;

public class Main 
{	
	public static String nome_personagem(String classe)
	{
		String nome = JOptionPane.showInputDialog("Nome para um personagem da classe " + classe);
		return nome;
	}
	
	public static int Round(int round)
	{
		JOptionPane.showMessageDialog(null, "Round " + round);
		round++;
		return round;
	}
	
	public static void main(String[] args) 
	{
		//Questão 3. a)
		ArrayList<Personagem> personagens = new ArrayList<Personagem>();
		
		personagens.add(new Cavaleiro(Main.nome_personagem("Cavaleiro")));
		personagens.add(new Cavaleiro(Main.nome_personagem("Cavaleiro")));
		
		personagens.add(new Dragão(Main.nome_personagem("Dragão")));
		personagens.add(new Dragão(Main.nome_personagem("Dragão")));
		
		personagens.add(new Mago(Main.nome_personagem("Mago")));
		personagens.add(new Mago(Main.nome_personagem("Mago")));
		
		//Questão 3. b)
		Jogo jogar = new Jogo();
		jogar.ControlarAcoesDosPersonagens(personagens);
		
		//Questão 3. c)
		Personagem p = new Mago("Harold");
		((Mago) p).invisibilidade();
		
		System.out.println("--------------------------------------------------");
		
		//Escolha das ações dos personagens
		try 
		{	
			int sair = 0;
			int round = 1;
			while (sair == 0) {
				round = Main.Round(round);
				for (int i = 0; i < personagens.size(); i++)
				{
					JOptionPane.showMessageDialog(null, "Turno de " + personagens.get(i).getNome());
					
					//Definindo escolhas de ações possíveis para cada personagem
					
					if (personagens.get(i) instanceof Cavaleiro) 
					{
						String ações[] = {"Andar", "Guardar item", "Usar item", "Atacar", "Defender", "Saltar"};
						String escolha = (String) JOptionPane.showInputDialog(null, "O que deve ser feito?", "Ações", JOptionPane.QUESTION_MESSAGE, null, ações, ações[0]);
						switch (escolha) 
						{
							case ("Andar"):
								personagens.get(i).andar();
								break;
							
							case ("Guardar item"):
								personagens.get(i).guardarItem();
								break;
								
							case ("Usar item"):
								personagens.get(i).usarItem();
								break;
								
							case ("Atacar"):
								((Cavaleiro) personagens.get(i)).atacar();
								break;
							
							case ("Defender"):
								((Cavaleiro) personagens.get(i)).defender();
								break;
							
							case ("Saltar"):
								((Cavaleiro) personagens.get(i)).saltar();
								break;
						}
					}
						
					else if (personagens.get(i) instanceof Dragão) 
					{
						String ações[] = {"Andar", "Guardar item", "Usar item", "Atirar fogo", "Voar", "Morder"};
						String escolha = (String) JOptionPane.showInputDialog(null, "O que deve ser feito?", "Ações", JOptionPane.QUESTION_MESSAGE, null, ações, ações[0]);
						switch (escolha) 
						{
							case ("Andar"):
								personagens.get(i).andar();
								break;
							
							case ("Guardar item"):
								personagens.get(i).guardarItem();
								break;
								
							case ("Usar item"):
								personagens.get(i).usarItem();
								break;
								
							case ("Atirar fogo"):
								((Dragão) personagens.get(i)).atirarFogo();
								break;
							
							case ("Voar"):
								((Dragão) personagens.get(i)).voar();
								break;
							
							case ("Morder"):
								((Dragão) personagens.get(i)).morder();
								break;
						}
					}
					
					else if (personagens.get(i) instanceof Mago) 
					{
						String ações[] = {"Andar", "Guardar item", "Usar item", "Invisibilidade", "Ultra rapidez"};
						String escolha = (String) JOptionPane.showInputDialog(null, "O que deve ser feito?", "Ações", JOptionPane.QUESTION_MESSAGE, null, ações, ações[0]);
						switch (escolha) 
						{
							case ("Andar"):
								personagens.get(i).andar();
								break;
							
							case ("Guardar item"):
								personagens.get(i).guardarItem();
								break;
								
							case ("Usar item"):
								personagens.get(i).usarItem();
								break;
								
							case ("Invisibilidade"):
								((Mago) personagens.get(i)).invisibilidade();
								break;
							
							case ("Ultra rapidez"):
								((Mago) personagens.get(i)).ultraRapidez();
								break;
						}
					}
					System.out.println("--------------------------------------------------");
				}
				sair = JOptionPane.showConfirmDialog(null, "Deseja continuar jogando?", null, JOptionPane.YES_NO_OPTION);
			}
		}
		
		catch(Exception erro)
		{
			System.out.println(erro.getMessage());
			erro.printStackTrace();
		}
		
	}
}
