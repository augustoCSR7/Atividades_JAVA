
public class Professor {

	private String nome;
	private String cpf;
	private Turma turma;
	
	public Professor(){
		
	}
	
	public Professor(String nome, String cpf, Turma turma){
		
		this.nome = nome;
		this.cpf = cpf;
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	
	
	
}
