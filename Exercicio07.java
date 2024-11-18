package java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C.
		 *  Em seguida, calcule e mostre:
		 *  a) a área do triângulo retângulo que tem A por base e C por altura.
		 *  b) a área do círculo de raio C. (pi = 3.14159)
		 *  c) a área do trapézio que tem A e B por bases e C por altura.
		 *  d) a área do quadrado que tem lado B.
		 *  e) a área do retângulo que tem lados A e B.
		 */

		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
						
		System.out.print("Digite em metros valor de A: ");
		double A = teclado.nextDouble();
		
		System.out.print("Digite em metros valor de B: ");
		double B = teclado.nextDouble();
		
		System.out.print("Digite em metros valor de C: ");
		double C = teclado.nextDouble();
		
		double triangulo = (A * C)/ 2;
		System.out.printf("A área do triangulo retangulo que tem %.2fm por base e %.2fm por altura é de: %.2fm %n", A, C, triangulo);
		
		double pi = 3.14159;
		double circulo = pi * (C * C);
		System.out.printf("A área do circulo de raio %.2fm é de: %.2fm %n", C, circulo);
		
		double trapezio = ((A + B) * C)/ 2;
		System.out.printf("A área do trapezio que tem %.2fm e %.2fm de bases e %.2fm de altura é de: %.2fm %n", A, B, C, trapezio);
		
		double quadrado = B * B;
		System.out.printf("A área do quadrado que tem como lado %.2fm é de: %.2fm %n", B, quadrado);
		
		double retangulo = A * B;
		System.out.printf("A área do retangulo que tem como lados %.2fm e %.2fm é de %.2fm %n", A, B, retangulo);
		
				
		teclado.close();
		
	}

}
