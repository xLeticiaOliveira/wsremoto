package br.com.caicai.modelo;

public class Elevador {
	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;
	
	public void configurar(short maximo, short minimo, byte capacidade) {
		andarMaximo = maximo;
		andarMinimo = minimo;
		if(capacidade > 0) {
			qtdePessoas = capacidade;
		}
	}
	
	public void preencherNome(String param) {
		nome = param;
	}
	
	public String retornarNome() {
		return nome;
	}
	
	public void subir() {
		if(andarAtual < andarMaximo) {
			andarAtual += 1;
		} 
	}
	
	public void descer() {
		if(andarAtual > andarMinimo) {
			andarAtual -= 1;
		}
	}
	
	public String entrar(byte qtde) {
		if(qtdePessoas+qtde <= capacidadeMaxima) {
			qtdePessoas += qtde;
			return "Entraram" + qtde + "pessoas";
		}
		else {
			return "Ninguém entrou";
		}
	}
	
	public String sair(byte qtde) {
		if(qtdePessoas-qtde >= 0) {
			qtdePessoas -= qtde;
			return "Saíram "+ qtde +" pessoas";
		}
		else {
			return "Ninugém saiu";
		}
	}
	
	public void subir(byte andar) {
		if(andarAtual+andar <= andarMaximo) {
			andarAtual += andar;
		}
	}
	
	public String exibirResumo() {
		return "Elevador: " + nome + "\nAndar atual: " + andarAtual + "\nQuantidade de pessoas: " + qtdePessoas;
	}
}
