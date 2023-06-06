
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario1 = new Funcionario("Jose","PI00AM");
		funcionario1.addDependente("Fabio", "filho");
		funcionario1.addDependente("Fernanda", "esposa");
		
		System.out.println("Funcionario: "+funcionario1.getNome());
		System.out.println("Matricula: "+funcionario1.getMatricula());
		
		System.out.println(funcionario1.obterDependentes());
		//funcionario = null;
		
		

	}

}
