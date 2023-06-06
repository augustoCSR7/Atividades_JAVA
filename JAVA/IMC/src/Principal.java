import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		String nome = JOptionPane.showInputDialog("Forneça seu nome");
		String idade = JOptionPane.showInputDialog("Forneça sua idade");		
		String altura = JOptionPane.showInputDialog("Forneça sua altura");
		String peso = JOptionPane.showInputDialog("Forneça seu peso");
		
		
		int i = Integer.parseInt(idade);
		float a = Float.parseFloat(altura);
		float p = Float.parseFloat(peso);
		
		pessoa.setNome(nome);
		pessoa.setIdade(i);
		pessoa.setAltura(a);
		pessoa.setPeso(p);
		
		pessoa.calularIMC();
		
				
		JOptionPane.showMessageDialog(null, pessoa.toString()+
				"Susgestão:"+pessoa.exibirMSG());		

	}

}
