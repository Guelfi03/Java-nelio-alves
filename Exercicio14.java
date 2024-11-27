package java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		/* Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		 * de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o 
		 * ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
		 *  Se o ponto estiver na origem, escreva a mensagem “Origem”. 
		 *  Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, 
		 *  conforme for a situação
		*/  

		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a coordenada X: ");
		double x = teclado.nextDouble();
		
		System.out.print("Digite a coordenada Y: ");
		double y = teclado.nextDouble();
		
		if (x == 0.0 && y == 0.0) {
			System.out.println("O ponto está na origem");
		}
		else if (x > 0.0 && y > 0.0) {
			System.out.println("O ponto está no Quadrante 1");
		}
		else if (x < 0.0 && y > 0.0) {
			System.out.println("O ponto está no Quadrante 2");
		}
		else if (x < 0.0 && y < 0.0) {
			System.out.println("O ponto está no Quadrante 3");
		}
		else if (x > 0.0 && y < 0.0) {
			System.out.println("O ponto está no Quadrante 4");
		}
		else if (x == 0) {
			System.out.println("O ponto está no Eixo Y");
		}
		else {
			System.out.println("O ponto está no Eixo X");
		}
		teclado.close();
	}

}
