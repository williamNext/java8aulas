package br.com.alura.java8.application;

public class Curso {
	private String nome;
	private int alunos;

	
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAlunos() {
		return alunos;
	}
	public void setIdade(int idade) {
		this.alunos = idade;
	}

	
	
}
