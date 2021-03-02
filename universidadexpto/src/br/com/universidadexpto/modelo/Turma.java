package br.com.universidadexpto.modelo;

public class Turma {
	private int numero;
	private String periodo;
	private Curso curso;
	private Pessoa professor;
	private Pessoa aluno;
	
	public Turma() {
		super();
	}

	public Turma(int numero, String periodo, Curso curso, Pessoa professor, Pessoa aluno) {
		super();
		this.numero = numero;
		this.periodo = periodo;
		this.curso = curso;
		this.professor = professor;
		this.aluno = aluno;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Pessoa getProfessor() {
		return professor;
	}

	public void setProfessor(Pessoa professor) {
		this.professor = professor;
	}

	public Pessoa getAluno() {
		return aluno;
	}

	public void setAluno(Pessoa aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return "Turma [numero=" + numero + ", periodo=" + periodo + ", curso=" + curso + ", professor=" + professor
				+ ", aluno=" + aluno + "]";
	}
	
	
}
