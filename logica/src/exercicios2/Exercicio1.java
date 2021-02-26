package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite a qtde de diárias"));
		float total;
		
		
		if (diarias < 0) {
			JOptionPane.showMessageDialog(null, "Número de diárias inválido");
		}
			else {
			if (diarias > 15) {
				total = 5.5f * diarias;
			}
			else if (diarias == 15) {
				total = 6f * diarias;
			}
			else {
				total = 8f * diarias;
			}
			JOptionPane.showMessageDialog(null, "A conta total é: " + total);
		}
	}
}
