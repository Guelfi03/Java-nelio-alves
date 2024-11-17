package java_nelio_alves;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		/*
		* Faça um programa para ler dois valores inteiros,
		* e depois mostrar na tela a soma desses números com uma
		* mensagem explicativa, conforme exemplos. 
		*/
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Digite um número inteiro: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		int num2 = teclado.nextInt();
		
		int soma = num1 + num2;
		System.out.printf("A soma de %d + %d = %d %n", num1, num2, soma);
				
		teclado.close();
	}

}
