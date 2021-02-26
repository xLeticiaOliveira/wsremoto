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
		 * Você deverá calcular o imposto sobre o valor unitário
		 * Se for alimentício, o imposto será de 5%
		 * Se for eletrônico, o imposto será de 7%
		 * Se a qtde for maior do que 100, o imposto será menor em 1%
		 * Se a qtde estiver entre 50 e 100 o imposto será menor em 0,5%
		 * Se a qtde for menor que 50 o imposto será integral
		 */
		
		String nome = JOptionPane.showInputDialog("Produto").toLowerCase(); 
		String genero = JOptionPane.showInputDialog("Gênero do produto").toLowerCase();
		short qtde = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade"));
		float valorunitario = Float.parseFloat(JOptionPane.showInputDialog("Valor unitário"));
		
		float abatimento = 0;
		
		if (qtde > 100) {
			abatimento = 0.01f;
		}
		else if (qtde > 50) {
			abatimento = 0.005f;
		}

		
		if(genero.equals("alimentício") || genero.equals("alimenticio")) {
			System.out.println("O valor total da compra de " + qtde + " " + nome + "(s) é: " + (qtde*valorunitario)*(1.05f-abatimento));
		}
		else if (genero.equals("eletrônico") || genero.equals("eletronico")) {
			System.out.println("O valor total da compra de " + qtde + " " + nome + "(s) é: " + (qtde*valorunitario)*(1.07f-abatimento));
		}
		else { 
			JOptionPane.showMessageDialog(null, "Gênero do produto não encontrado");
		}
		
		
		
				
		
		

	}

}
