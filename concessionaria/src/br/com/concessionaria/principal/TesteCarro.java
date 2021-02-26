package br.com.concessionaria.principal;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// Instanciando um objeto
		Carro objeto = new Carro();
		objeto.preencherCor(JOptionPane.showInputDialog("Digite a cor"));
		System.out.println(objeto.retornarCor());
		
		objeto.ligar();
		System.out.println(objeto.retornarResumo());
		objeto.desligar();
		System.out.println(objeto.retornarResumo());
		objeto.acelerar((short) 10);
		objeto.acelerar((short) 10);
		System.out.println(objeto.retornarResumo());
		objeto.brecar((short) 5);
		System.out.println(objeto.retornarResumo());
		objeto.desligar();
		objeto.acelerar((short) 10);
		System.out.println(objeto.retornarResumo());
	}

}
