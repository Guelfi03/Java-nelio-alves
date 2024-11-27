package java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		/* Você deve fazer um programa que leia um valor qualquer e 
		 * apresente uma mensagem dizendo em qual dos seguintes intervalos
		 * ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
		 * Obviamente se o valor não estiver em nenhum destes intervalos,
		 *  deverá ser impressa a mensagem “Fora de intervalo”
		 */
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US); 
		
		System.out.println("Digite um valor entre 0 e 100");
		double valor = teclado.nextDouble();
		
		if (valor < 0.0 || valor > 100.0) {
			System.out.printf("%.2f não está entre [0, 100]", valor);
		}
		else if (valor <= 25.0) {
			System.out.printf("%.2f está entre [0, 25]", valor);
		}
		else if (valor <= 50.0) {
			System.out.printf("%.2f está entre [25, 50]", valor);
		}
		else if (valor <= 75.0) {
			System.out.printf("%.2f está entre [50, 75]", valor);
		}
		else {
			System.out.printf("%.2f está entre [75, 100]", valor);
		}
		
		teclado.close();
	}

}
