package java_nelio;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1,
		 * o número de peças 1, o valor unitário de cada peça 1, 
		 * o código de uma peça 2, o número de peças 2
		 * e o valor unitário de cada peça 2.
		 * Calcule e mostre o valor a ser pago.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o código do modelo nº1: ");
		int codigoN1 = teclado.nextInt();
		
		System.out.print("Digite a quantidade de peças: ");
		int quantidadeN1 = teclado.nextInt();
		
		System.out.print("Digite o valor unitário da peça: R$ ");
		double valorN1 = teclado.nextDouble();
		
		double N1 = quantidadeN1 * valorN1;
		System.out.printf("Modelo %d: %n", codigoN1);
		System.out.printf("%d un. x R$ %.2f = R$ %.2f%n", quantidadeN1, valorN1, N1);
		
		System.out.print("Digite o código do modelo nº2: ");
		int codigoN2 = teclado.nextInt();
		
		System.out.print("Digite a quantidade de peças: ");
		int quantidadeN2 = teclado.nextInt();
		
		System.out.print("Digite o valor unitário da peça: R$ ");
		double valorN2 = teclado.nextDouble();
		
		double N2 = quantidadeN2 * valorN2;
		System.out.printf("Modelo %d: %n", codigoN2);
		System.out.printf("%d un. x R$ %.2f = R$ %.2f%n", quantidadeN2, valorN2, N2);
	
		double soma = N1 + N2;
		System.out.println("Resumo do pedido: ");
		System.out.printf("Modelo %d: ", codigoN1);
		System.out.printf("%d un. x R$ %.2f = R$ %.2f%n", quantidadeN1, valorN1, N1);
		System.out.printf("Modelo %d: ", codigoN2);
		System.out.printf("%d un. x R$ %.2f = R$ %.2f%n", quantidadeN2, valorN2, N2);
		System.out.printf("O valor total é de: R$ %.2f", soma);
		
		teclado.close();
	}

}
