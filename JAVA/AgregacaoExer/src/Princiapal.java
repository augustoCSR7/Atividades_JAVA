
public class Princiapal {

	public static void main(String[] args) {
		
		//TURMAS
		Turma matematica = new Turma();
		matematica.setCodigo("MAT19264");
		matematica.setSala(21);
		matematica.setDia("Segunda e Sexta");
		matematica.setHorario("18h as 21h");
		
		Turma portugues = new Turma();
		portugues.setCodigo("PORT21846");
		portugues.setSala(18);
		portugues.setDia("Terça e quinta");
		portugues.setHorario("15h as 17h");
		
		//ALUNOS
		Aluno aluno1 = new Aluno();
		aluno1.setMatricula("1726384639");
		aluno1.setNome("Augusto Cesar");
		aluno1.setMediaFinal((float) 8.3);
		
		Aluno aluno2 = new Aluno();
		aluno2.setMatricula("1726393262");
		aluno2.setNome("Paulo Henrique");
		aluno2.setMediaFinal(4.3f);
		
		Aluno aluno3 = new Aluno();
		aluno3.setMatricula("7463253948");
		aluno3.setNome("Rafaela Silva");
		aluno3.setMediaFinal((float) 9.7);
		
		matematica.addAlunos(aluno1);
		portugues.addAlunos(aluno2);
		matematica.addAlunos(aluno3);
		
		//TURMA DE MATEMATICA DESTRUIDA
		//matematica = null;
		
		//PRINTANDO NOME DO ALUNO QUE ERA DA TURMA DE MATEMATICA
		System.out.println(portugues.mostrarAlunos());
	}

}
