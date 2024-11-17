package java_nelio_alves;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler quatro valores inteiros A, B, C e D. 
		 * A seguir, calcule e mostre a diferença do produto de A e B 
		 * pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número inteiro: ");
		int A = teclado.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		int B = teclado.nextInt();
		
		System.out.print("Digite o terceiro número inteiro: ");
		int C = teclado.nextInt();
		
		System.out.print("Digite o quarto número inteiro: ");
		int D = teclado.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.printf("A diferença do produto de %d e %d pelo produto "
				+ "de %d e %d é de: ", A, B, C, D);
		System.out.print(diferenca);
		
		
		teclado.close();
	}
}
