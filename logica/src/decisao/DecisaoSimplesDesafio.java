package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
		/*
		 * Capturar:
		 *  Nome e idade de uma pessoa
		 *  Avaliar a idade para exibir uma das mensagens abaixo:
		 *  
		 *  Pessoas com 16,17 ou maior que 70 -> "O seu voto é facultativo"
		 *  Pessoas entre 18 e 70 anos -> "Seu voto é obrigatório"
		 *  Pessoas com emnos de 16 anos -> "Você não pode votar"
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null, nome + ", você não pode votar");
		}
		if(idade >= 18 && idade <= 70) {
			JOptionPane.showMessageDialog(null, nome + ", seu voto é obrigatório");
		}
		if(idade == 16 || idade == 17 || idade > 70) {
			JOptionPane.showMessageDialog(null, nome + ", seu voto é facultativo");
		}
	}
}
