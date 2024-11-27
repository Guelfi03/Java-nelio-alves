package java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		/* Escreva um programa para ler as coordenadas (X,Y) 
		 * de uma quantidade indeterminada de pontos no sistema
		 * cartesiano. Para cada ponto escrever o quadrante a que ele pertence. 
		 * O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA 
		 * (nesta situação sem escrever mensagem alguma) 
		*/
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a coordenada X: ");
		double x = teclado.nextDouble();
		
		System.out.print("Digite a coordenada Y: ");
		double y = teclado.nextDouble();
		
		while (x != 0.0 && y != 0.0) {
		
			if (x > 0.0 && y > 0.0) {
				System.out.println("O ponto está no Quadrante 1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("O ponto está no Quadrante 2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("O ponto está no Quadrante 3");
			}
			else  {
				System.out.println("O ponto está no Quadrante 4");
			}
			
			System.out.print("Digite a coordenada X: ");
			x = teclado.nextDouble();
			
			System.out.print("Digite a coordenada Y: ");
			y = teclado.nextDouble();
		}
		
		teclado.close();
	}

	}


