package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeadaDesafio {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * nome do produto
		 * genero do produto (alimenticio, eletronico...)
		 * qtde
		 * valorunitario
		 * 
		 * Voc� dever� calcular o imposto sobre o valor unit�rio
		 * Se for aliment�cio, o imposto ser� de 5%
		 * Se for eletr�nico, o imposto ser� de 7%
		 * Se a qtde for maior do que 100, o imposto ser� menor em 1%
		 * Se a qtde estiver entre 50 e 100 o imposto ser� menor em 0,5%
		 * Se a qtde for menor que 50 o imposto ser� integral
		 */
		
		String nome = JOptionPane.showInputDialog("Produto").toLowerCase(); 
		String genero = JOptionPane.showInputDialog("G�nero do produto").toLowerCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade"));
		float valorunitario = Float.parseFloat(JOptionPane.showInputDialog("Valor unit�rio"));
		
		float abatimento = 0;
		
		if (qtde > 100) {
			abatimento = 0.01f;
		}
		else if (qtde > 50) {
			abatimento = 0.005f;
		}

		
		if(genero.equals("aliment�cio") || genero.equals("alimenticio")) {
			System.out.println("O valor total da compra de " + qtde + " " + nome + "(s) �: " + (qtde*valorunitario)*(1.05f-abatimento));
		}
		else if (genero.equals("eletr�nico") || genero.equals("eletronico")) {
			System.out.println("O valor total da compra de " + qtde + " " + nome + "(s) �: " + (qtde*valorunitario)*(1.07f-abatimento));
		}
		else { 
			JOptionPane.showMessageDialog(null, "G�nero do produto n�o encontrado");
		}
		
		
		
				
		
		

	}

}
