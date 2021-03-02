package br.com.universidadexpto.modelo;

public class Professor extends Pessoa {
	private String formacao;
	private String area;
	private String subarea;
	
	public Professor() {
		super();
	}

	public Professor(String nome, String email, String formacao, String area, String subarea) {
		super(nome, email);
		this.formacao = formacao;
		this.area = area;
		this.subarea = subarea;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSubarea() {
		return subarea;
	}

	public void setSubarea(String subarea) {
		this.subarea = subarea;
	}

	@Override
	public String toString() {
		return "Professor [formacao=" + formacao + ", area=" + area + ", subarea=" + subarea + "\nPessoa: " + super.toString() + "]";
	}
	
	
}
