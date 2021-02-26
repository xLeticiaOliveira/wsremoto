package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		
		/*
		 * Capturar nome e idade
		 * Requisitos para no final exibir o nome e a idade:
		 * - Nome deve possuir no mínimo 5 caracteres
		 * - Nome deve possuir no máximo 15 caracteres
		 * - Nome deve possuir um "espaço"
		 * - Idade deve estar entre 18 e 70 anos
		 */

		String nome = JOptionPane.showInputDialog("Nome").toLowerCase();
		while(!(nome.length() >= 5 && nome.length() <= 15 && nome.contains(" "))) {
			nome = JOptionPane.showInputDialog("Nome deve possuir entre 5 e 15 caracteres e conter espaço").toLowerCase();
		}
		
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
		while(!(idade >= 18 && idade <= 70)) {
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade tem que estar entre 18 e 70 anos"));
		}
	}

}
