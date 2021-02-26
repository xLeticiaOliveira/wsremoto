//Aula 2 - 23/02
package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite seu email");
		if(email.contains("@")) {
			System.out.println("Usuário: " + email.substring(0, email.indexOf("@")));
		}
		else {
			
		}
	}

}
