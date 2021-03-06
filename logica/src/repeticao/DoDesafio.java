package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {
	public static void main(String[] args) {
		/*
		 * Jogador1 vai digitar um n�mero
		 * Jogador2 vai ter que adivinhar o n�mero
		 * 
		 * Jogador2 s� pode receber a mensagem de parab�ns quando ele acertar
		 * 
		 * Miss�o 2:
		 * Acrescentar dicas para o jogador2 (numero maior ou menor)
		 * 
		 * Miss�o 3:
		 * Acrescentar na mensagem de parab�ns a quantidade de tentativas
		 * Dica: ciar uma vari�vel para contar
		 */
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int palpite=0;
		int tentativas=0;
		
		do {
			palpite = Integer.parseInt(JOptionPane.showInputDialog("Digite um palpite"));
			tentativas++;
			if (palpite > num) {
				JOptionPane.showMessageDialog(null, "� um n�mero menor do que esse");
			}
			else if (palpite < num) {
				JOptionPane.showMessageDialog(null, "� um n�mero maior do que esse");
			}
		} while(num!=palpite);
		JOptionPane.showMessageDialog(null, "Parab�ns! Voc� acertou com " + tentativas + " tentativa(s)");
	}
}
