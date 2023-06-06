package br.edu.uea.teste;

import br.edu.uea.exemplo.Professor;

public class Disciplina {
	
	private String nome;
	private Professor professor; 
	
	public Disciplina() {
		
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
