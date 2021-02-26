package exercicios3;

import javax.swing.JOptionPane;

public class Slide77Ex4 {

	public static void main(String[] args) {
		
		String nome = "";
		Short idade=0;
		
		String pessoaMaisNova="";
		short menorIdade = Short.MAX_VALUE;
		String pessoaMaisVelha="";
		short maiorIdade = Short.MIN_VALUE;
		int contador=0;
		int contadorMaiores=0;
		int totalIdade=0;
		
		do {
			nome = JOptionPane.showInputDialog("Nome " + contador);
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade " + contador));
			totalIdade += idade;
			
			if (idade < menorIdade) {
				menorIdade = idade;
				pessoaMaisNova = nome;
			}
			if (idade > maiorIdade) {
				maiorIdade = idade;
				pessoaMaisVelha = nome;
			}
			
			if (idade >= 18) {
				contadorMaiores++;
			}
			
			contador++;
		} while (JOptionPane.showConfirmDialog(null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION) == 0);

		System.out.println("Pessoa mais nova: " + pessoaMaisNova + " (" + menorIdade + " anos)");
		System.out.println("Pessoa mais velha: " + pessoaMaisVelha + " (" + maiorIdade + " anos)");
		System.out.println("Quantidade de maiores: " + contadorMaiores);
		System.out.println("Média das idades: " + (totalIdade/contador));

	}

}
