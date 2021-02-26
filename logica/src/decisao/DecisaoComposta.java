package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {		
		String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Parabéns");
		}
		else if(media < 4) {
			JOptionPane.showMessageDialog(null, "Você foi reprovado");
		}
		else if(media < 6 && media >= 4) {
			JOptionPane.showMessageDialog(null, "Você foi reprovado");
		}
		System.out.println("Sua média em " + nome + " foi: " + media);

	}

}
