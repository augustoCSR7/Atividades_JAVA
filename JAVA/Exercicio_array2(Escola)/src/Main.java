
import javax.swing.JOptionPane;


public class Main { 

	public static void main(String[] args) {       
		float[][] matriz = new float[3][5];  

		  
		float nota = 0;
		String resposta;
		for (int linha=0;linha<3;linha++) {			
			JOptionPane.showMessageDialog(null, "Classe "+(linha + 1));
			for (int coluna=0;coluna<5;coluna++){
				resposta = JOptionPane.showInputDialog("Digite a nota do aluno "+(coluna+1));
				nota = Float.parseFloat(resposta);
				matriz[linha][coluna] = nota;				
			}
		}
		
		float somaClasse1 = 0, somaClasse2 = 0, somaClasse3 = 0;
		float mediaClasse1 = 0 , mediaClasse2 = 0, mediaClasse3 = 0, mediaEscola = 0;
		
		for (int linha=0;linha<3;linha++) {
			for (int coluna=0;coluna<5;coluna++){
				System.out.println("Linha:"+linha+","+"Coluna:"+coluna); 
				System.out.println(matriz[linha][coluna]);
				if (linha == 0)
					somaClasse1 += matriz[linha][coluna];
				if (linha == 1)
					somaClasse2 += matriz[linha][coluna];
				if (linha == 2)
					somaClasse3 += matriz[linha][coluna];
				
			}
		}
		mediaClasse1 = somaClasse1/5;
		mediaClasse2 = somaClasse2/5;
		mediaClasse3 = somaClasse3/5;
		mediaEscola =  somaClasse1+somaClasse2+somaClasse3/15;
		
		JOptionPane.showMessageDialog(null, "Média da Classe 1 "+mediaClasse1+"\n"+
				"Média da Classe 2 "+mediaClasse2+"\n"+
				"Média da Classe 3 "+mediaClasse3+"\n");
		
		JOptionPane.showMessageDialog(null, "Média da Escola "+mediaEscola); 
		System.exit(0);  
	}
}
