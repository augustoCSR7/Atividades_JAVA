
public class principal {

	public static void main(String[] args) {
		 
		People[] pessoas = new People[4];
		
		pessoas[0] = new People();
		pessoas[0].setNome("Jose");
		
		pessoas[1] = new People();
		pessoas[1].setNome("Simone");
		
		pessoas[2] = new People();
		pessoas[2].setNome("Augusto");
		
		pessoas[3] = new People();
		pessoas[3].setNome("Cesar");
		
		for (int i = 0; i < pessoas.length; i++) {
			
			if (pessoas[i].getNome().equals("Augusto")) {
				System.out.println(pessoas[i].getNome() + " eh o usuario que vc procura!!");
				}else
					System.out.println(pessoas[i].getNome()+ " nao eh o usuario que vc procura");
		}

	}

}
