package java_nelio;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/* Escreva um programa que repita a leitura de uma senha até que ela seja válida.
		 * Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". 
		 * Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
		 * e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua senha: ");
		int senha = teclado.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			System.out.print("Digite sua senha: ");
			senha = teclado.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		teclado.close();
	}

}
