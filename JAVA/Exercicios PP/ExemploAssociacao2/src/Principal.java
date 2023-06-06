import java.util.ArrayList;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Projeto projeto1 = new Projeto("Xbox 3000",2);
		Projeto projeto2 = new Projeto("Next 1000",5);
		
		ArrayList<Projeto> projetos = new ArrayList<Projeto>();
        
		projetos.add(projeto1);
		projetos.add(projeto2);
		
		Pesquisador pesquisador1 = new Pesquisador("Fabio",123456, projetos);
		

	}

}
