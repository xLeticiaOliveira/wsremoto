//Aula 2 - 23/02
package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples2 {

	public static void main(String[] args) {
		/*
		 * Capturem:
		 *  - nome de uma disciplina
		 *  - duas notas
		 *  - calcular a media
		 *  - exibit a mensagem "Parab�ns" somente se a m�dia for maior ou igual a 6
		 */
		
		String nome = JOptionPane.showInputDialog("Digite o nome da disciplina");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
		float media = (nota1 + nota2)/2;
		
		if(media >= 6) {
			JOptionPane.showMessageDialog(null, "Parab�ns");
		}
		
		/*
		 *  Exibir "Voc� foi reprovado", se a media for menor que 4
		 */
		
		if(media < 4) {
			JOptionPane.showMessageDialog(null, "Voc� foi reprovado");
		}
		
		// && and 
		// || or
		if(media < 6 && media >= 4) {
			JOptionPane.showMessageDialog(null, "Voc� foi reprovado");
		}
		System.out.println("Sua m�dia em " + nome + " foi: " + media);
	}

}
