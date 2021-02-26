package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		/*
		 * For: Pr�prio para situa��es onde n�o h� intera��o com o usu�rio final
		 * Sintaxe:
		 * - Definir o contador e o inicio
		 * - Condi��o
		 * - Como ele vai contar
		 */
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		
		for(int contador=1; contador<11; contador++) {
			System.out.println(tabuada + " x " + contador + " = " + tabuada*contador);
		}
	}

}
