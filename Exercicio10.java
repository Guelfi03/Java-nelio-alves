package java_nelio_alves;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * Leia 2 valores inteiros (A e B). 
		 * Após, o programa deve mostrar uma mensagem "Sao Multiplos" 
		 * ou "Nao sao Multiplos", 
		 * indicando se os valores lidos são múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em
		 * ordem crescente ou decrescente.
		 */
		
		System.out.print("Digite um numero inteiro: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Digite outro numero inteiro ");
		int num2 = teclado.nextInt();
		
		if (num1 % num2 == 0 || num2 % num1 == 0)
			System.out.printf("Os numeros %d e %d são multiplos", num1, num2);
		
		else
			System.out.printf("Os numeros %d e %d não são multiplos", num1, num2);
		
		
		teclado.close();

	}

}
