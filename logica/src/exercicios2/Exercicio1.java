package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite a qtde de di�rias"));
		float total;
		
		
		if (diarias < 0) {
			JOptionPane.showMessageDialog(null, "N�mero de di�rias inv�lido");
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
			JOptionPane.showMessageDialog(null, "A conta total �: " + total);
		}
	}
}
