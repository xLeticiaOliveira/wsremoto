package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {
	public static void main(String[] args) {
		/*
		 * Capturar:
		 *  Nome e idade de uma pessoa
		 *  Avaliar a idade para exibir uma das mensagens abaixo:
		 *  
		 *  Pessoas com 16,17 ou maior que 70 -> "O seu voto � facultativo"
		 *  Pessoas entre 18 e 70 anos -> "Seu voto � obrigat�rio"
		 *  Pessoas com emnos de 16 anos -> "Voc� n�o pode votar"
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		short idade = Short.parseShort(JOptionPane.showInputDialog("Digite sua idade"));
		
		if(idade < 16) {
			JOptionPane.showMessageDialog(null, nome + ", voc� n�o pode votar");
		}
		if(idade >= 18 && idade <= 70) {
			JOptionPane.showMessageDialog(null, nome + ", seu voto � obrigat�rio");
		}
		if(idade == 16 || idade == 17 || idade > 70) {
			JOptionPane.showMessageDialog(null, nome + ", seu voto � facultativo");
		}
	}
}
