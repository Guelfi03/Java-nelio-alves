package java_nelio_alves;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para ler o valor do raio de um círculo,
		 * e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio2
		 * Considere o valor de π = 3.14159
		 */
		
		Scanner teclado = new Scanner(System.in);
		
					
		System.out.print("Digite o raio do círculo: ");
		double raio = teclado.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A área do circulo é de %.2f", area);		
		
			teclado.close();
	}

}
