package decisao;

import javax.swing.JOptionPane;

public class DecisaoCompostaDesafio {

	public static void main(String[] args) {
		/*
		 * Capture dois times e seus respectivos placares:
		 * Exiba,
		 * "Time 1 venceu"
		 * ou
		 * "Time 2 venceu
		 * ou
		 * "Houve um empate"
		 */
		
		String time1 = JOptionPane.showInputDialog("Time 1");
		byte placar1 = Byte.parseByte(JOptionPane.showInputDialog("Digite o placar do time 1"));
		String time2 = JOptionPane.showInputDialog("Time 2");
		byte placar2 = Byte.parseByte(JOptionPane.showInputDialog("Digite o placar do time 2"));
		
		if(placar1 == placar2) {
			System.out.println("Houve um empate");	
		}
		else if (placar1 > placar2) {
			System.out.println(time1 + " venceu");
		}
		else {
			System.out.println(time2 + " venceu");
		}
	}
	

}
