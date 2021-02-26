package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {	
		/*
		 * Capturar a qtde de faltas.
		 * Para que ele esteja aprovado ou de exame, ele tamb�m precisa que
		 * a qtde de faltas seja menor do que 20
		 */

		String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de faltas"));
		float media = (nota1 + nota2)/2;

		if (faltas >= 20) {
			System.out.println("Voc� est� reprovado por faltas.");
		}
		else {
			if(media >= 6) {
				JOptionPane.showMessageDialog(null, "Parab�ns voc� foi aprovado");
			}
			else if(media < 4) {
				JOptionPane.showMessageDialog(null, "Voc� foi reprovado por nota");
			}
			else if(media < 6 && media >= 4) {
				JOptionPane.showMessageDialog(null, "Voc� est� de exame");
			}
			System.out.println("Sua m�dia em " + nome + " foi: " + media);
		}
	}

}
