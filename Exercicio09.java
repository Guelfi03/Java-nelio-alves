package java_nelio_alves;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número inteiro
		 * e dizer se este número é par ou ímpar.
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = teclado.nextInt();
		
		if (num % 2 == 0)
			System.out.print("O número digitado é par");
		
		else	
			System.out.print("O número digitado é ímpar");
		
		
		teclado.close();

	}

}
