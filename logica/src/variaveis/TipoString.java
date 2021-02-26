//Aula 2 - 23/02
package variaveis;

public class TipoString {
	
	public static void main(String[] args) {
		// String � um tipo de refer�ncia
		String email = "leticia.sousa-oliveira@ITAU-UNIBANCO.com.br";
		System.out.println("Original: " + email);
		System.out.println("Min�sculo: " + email.toLowerCase());
		System.out.println("Mai�scula: " + email.toUpperCase());
		System.out.println("Qtde caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do arroba? " + email.indexOf("@"));
		System.out.println("Exibir do 3� ao 5�: " + email.substring(2,5));
		System.out.println("Exibir a partir do 5�: " + email.substring(4));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Comparando primitivos: " + (8==9));
		System.out.println("Comparando Strings: " + email.equals("leticia.sousa-oliveira@ITAU-UNIBANCO.com.br")); // Tem o equalsIgnoreCase tb
		
		/*
		 * Exibam somente o nome do usu�rio do email
		 */
		System.out.println("Nome do usu�rio: " + email.substring(0, email.indexOf("@")));
	}
}
