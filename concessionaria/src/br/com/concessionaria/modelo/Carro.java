package br.com.concessionaria.modelo;

public class Carro {
	
	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;
	
	
	public void preencherCor(String param) {
		cor = param.toUpperCase();		
	}
	
	public String retornarCor() {
		return cor;
	}
	
	public void preencherValor(float param) {
		if (param > 0) {
			valor = param;
		}
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public void ligar() {
		status = true;
	}
	
	public void desligar() {
		status = false;
		velocidadeAtual=0;
	}
	
	public void acelerar(short velocidade) {
		if(status) {
			velocidadeAtual += velocidade;	
		}
	}
	
	public void brecar(short velocidade) {
		if(status) {
			velocidadeAtual -= velocidade;
		}
	}
	
	public String retornarResumo() {
		String strStatus = "Ligado";
		if (!status) {
			strStatus = "Desligado";
		}
		return "Modelo: " + modelo + ".\nStatus: " + strStatus + ".\nVelocidade atual: " + velocidadeAtual;
	}
 }
