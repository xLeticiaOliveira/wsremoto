package repeticao;

import javax.swing.JOptionPane;

public class DoExemplo {

	public static void main(String[] args) {
		char resposta='x';
		float salario=0;
		do {
			salario = Float.parseFloat(JOptionPane.showInputDialog("Sal�rio"));
			System.out.println("FGTS: " + (salario*0.08));
			resposta = JOptionPane.showInputDialog("Digite S para continuar").toUpperCase().charAt(0);
		} while(resposta=='S');	
	}

}
