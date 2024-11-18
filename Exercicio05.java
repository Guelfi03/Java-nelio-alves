package java_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		 * o valor que recebe por hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		 */

		Scanner teclado = new Scanner(System.in); 
		
		System.out.print("Digite seu número de funcionário: ");
		int employeeNumber = teclado.nextInt();
		
		System.out.print("Digite o número de horas trabalhadas: ");
		int numberHoursWorked = teclado.nextInt();
		
		System.out.print("Digite quanto você recebe por hora: ");
		double valueHoursWorked = teclado.nextDouble();
				
		System.out.printf("Seu número de funcionário é %d%n", employeeNumber);
		
		Locale.setDefault(Locale.US); 
		
		double wage = numberHoursWorked * valueHoursWorked;
		System.out.printf("Seu salário é de U$ %.2f", wage);
		
		teclado.close();

	}

}
