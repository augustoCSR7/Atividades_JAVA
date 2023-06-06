import javax.swing.JOptionPane;
import java.lang.Math;

public class principal1 {

	public static void main(String[] args) {
		
		people[] nomes = new people[10];
		
		nomes[0] = new people();
		nomes[0].setNome("Renato");
		
		nomes[1] = new people();
		nomes[1].setNome("Thalita");
		
		nomes[2] = new people();
		nomes[2].setNome("Rhuan");
		
		nomes[3] = new people();
		nomes[3].setNome("Bianca");
		
		nomes[4] = new people();
		nomes[4].setNome("Ronaldo");
		
		nomes[5] = new people();
		nomes[5].setNome("Bia");
		
		nomes[6] = new people();
		nomes[6].setNome("Bruno");
		
		nomes[7] = new people();
		nomes[7].setNome("Sandra");
		
		nomes[8] = new people();
		nomes[8].setNome("Jackson");
		
		nomes[9] = new people();
		nomes[9].setNome("Jaqueline");
		
		int min = 0;
		int max = 9;
		
		int sorteado = (int)(Math.random()*(max-min+1)+min);		
		JOptionPane.showMessageDialog(null, "Ganhador: " + nomes[sorteado].getNome());
	}

}
