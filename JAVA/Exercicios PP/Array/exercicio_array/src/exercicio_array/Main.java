package exercicio_array;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		People[] peoples = new People[10];
		for (int i = 0; i < peoples.length; i++) {
			peoples[i] = new People();
			peoples[i].setName(JOptionPane.showInputDialog("Digite seu nome"));
			System.out.println(peoples[i].getName());
		}
		
		//Procurando nome
		String find = JOptionPane.showInputDialog("Nome a buscar");
		boolean achou = false;
		for (int i = 0; i < peoples.length; i++) {
			if(peoples[i].getName().contentEquals(find)) {
				achou = true;
				break;
			}
		}
		if (achou == true) {
			JOptionPane.showMessageDialog(null, "Nome encontrado!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Nome não encontrado!!!");
		}
		
		//Sorteando nome
		int random_int = (int)(Math.random()*9);
		JOptionPane.showMessageDialog(null, "Nome sorteado: " + peoples[random_int].getName());

	}

}
