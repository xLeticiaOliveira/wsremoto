package br.com.universidadexpto.modelo;

public class Aluno extends Pessoa {
	private int rm;
	private boolean bolsista;
	
		
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, String email, int rm, boolean bolsista) {
		super(nome, email);
		this.rm = rm;
		this.bolsista = bolsista;
	}


	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", bolsista=" + bolsista + "\nPessoa: " + super.toString() + "]";
	}
	
	
	
}
