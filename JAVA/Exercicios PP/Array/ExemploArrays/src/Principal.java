
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Pessoa[] pessoas = new Pessoa[10];
	
	pessoas[0] = new Pessoa(); 
	pessoas[0].setNome("Priscilla");
			
	pessoas[1] = new Pessoa();
	pessoas[1].setNome("Emanuel");
		
	pessoas[2] = new Pessoa();
	pessoas[2].setNome("Fabio");
	
	pessoas[3] = new Pessoa();
	pessoas[3].setNome("Caio");
		
	pessoas[4] = new Pessoa();
	pessoas[4].setNome("Fernanda");
	
	pessoas[5] = new Pessoa();
	pessoas[5].setNome("Maria");
		
	pessoas[6] = new Pessoa();
	pessoas[6].setNome("Caleb");
		
	pessoas[7] = new Pessoa();
	pessoas[7].setNome("Carlos");
		
	pessoas[8] = new Pessoa();
	pessoas[8].setNome("Erick");
	
	pessoas[9] = new Pessoa();
	pessoas[9].setNome("Felipe");
		
	for (int i = 0; i < pessoas.length; i++) {
		
		if (pessoas[i].getNome().equals("Fabio")) {
			System.out.println(pessoas[i].getNome()+" O usuario foi encontrado");
		}else
			System.out.println(pessoas[i].getNome()+" Nao eh o usuario que vc procura");		
		
	}
	

	
	
	

	}

}
