import java.util.ArrayList;
public class Turma {
	
	private String codigo;
	private int sala;
	private String dia;
	private String horario;
	private ArrayList<Aluno> alunos = new ArrayList<>();
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	//Alunos
	public void addAlunos(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public String mostrarAlunos() {
		String texto = "\nListas de alunos:";
		for ( int i=0;i<this.alunos.size();i++) {
			texto += "\n\nNome: " + this.alunos.get(i).getNome() +
			"\nMatricula: " + this.alunos.get(i).getMatricula() + 
			"\nMedia final: " + this.alunos.get(i).getMediaFinal();
		}
		return texto;
	}

}
