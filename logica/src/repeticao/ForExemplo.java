package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		/*
		 * For: Próprio para situações onde não há interação com o usuário final
		 * Sintaxe:
		 * - Definir o contador e o inicio
		 * - Condição
		 * - Como ele vai contar
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		
		for(int contador=1; contador<11; contador++) {
			System.out.println(tabuada + " x " + contador + " = " + tabuada*contador);
		}
	}

}
