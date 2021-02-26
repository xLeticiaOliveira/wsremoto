//Aula 2 - 23/02
package variaveis;

public class TipoString {
	
	public static void main(String[] args) {
		// String é um tipo de referência
		String email = "leticia.sousa-oliveira@ITAU-UNIBANCO.com.br";
		System.out.println("Original: " + email);
		System.out.println("Minúsculo: " + email.toLowerCase());
		System.out.println("Maiúscula: " + email.toUpperCase());
		System.out.println("Qtde caracteres: " + email.length());
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do arroba? " + email.indexOf("@"));
		System.out.println("Exibir do 3º ao 5º: " + email.substring(2,5));
		System.out.println("Exibir a partir do 5º: " + email.substring(4));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		System.out.println("Comparando primitivos: " + (8==9));
		System.out.println("Comparando Strings: " + email.equals("leticia.sousa-oliveira@ITAU-UNIBANCO.com.br")); // Tem o equalsIgnoreCase tb
		
		/*
		 * Exibam somente o nome do usuário do email
		 */
		System.out.println("Nome do usuário: " + email.substring(0, email.indexOf("@")));
	}
}
