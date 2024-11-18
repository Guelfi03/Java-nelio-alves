package java_nelio_alves;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
	
	/*
	 * Fazer um programa para ler um número inteiro,
	 * e depois dizer se este número é negativo ou não
	 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int num = teclado.nextInt();
		
		if (num > 0){
			System.out.print("O número digitado é positivo");
					}
		else 
			System.out.print("O número digitado é negativo");
		
		
		teclado.close();
	}

}
