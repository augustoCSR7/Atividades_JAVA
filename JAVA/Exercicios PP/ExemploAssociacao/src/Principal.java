
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Turma turmaEST = new Turma();
		turmaEST.setCodigo("EST20140001");
		
		
		Turma turmaEST2 = new Turma();
		turmaEST2.setCodigo("EST20140002");
		
		
		Professor prof = new Professor("Flavio","44357889",turmaEST);
		
		Professor prof2 = new Professor("Salvador","2345676",turmaEST2);
		
		
		System.out.println("O professor:"+prof.getNome()+" leciona para turma:"+turmaEST.getCodigo());
		
		System.out.println("O professor:"+prof2.getNome()+" leciona para turma:"+turmaEST2.getCodigo());
		
		
		

	}

}
