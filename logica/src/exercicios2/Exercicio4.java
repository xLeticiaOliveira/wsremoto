package exercicios2;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro valor"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo valor"));
		int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro valor"));
		
		int maior, medio, menor;

		
		
		
		if(valor1 > valor2) {
			medio = valor1;
			if(valor1 > valor3) {
				maior = valor1;
				if(valor2 > valor3) {
					medio = valor2;
					menor = valor3;
				}
				else {
					medio = valor3;
					menor = valor2;
				}
			}
			else {
				menor = valor2;
				maior = valor3;
			}
			
		}
		else {
			medio = valor2;
			if(valor2 > valor3) {
				maior = valor2;
				if(valor1 > valor3) {
					medio = valor1;
					menor = valor3;
				}
				else {
					medio = valor3;
					menor = valor1;
				}
			}
			else {
				menor = valor1;
				maior = valor3;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("M�dio: " + medio);
		System.out.println("Menor: " + menor);
	}
}
