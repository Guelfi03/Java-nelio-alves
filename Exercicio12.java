package java_nelio_alves;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * Com base na tabela abaixo, 
		 * escreva um programa que leia
		 * o código de um item e a 
		 * quantidade deste item.
		 * A seguir, calcule e 
		 * mostre o valor da conta a pagar
		 */

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o codigo do produto: ");
		int codigo = teclado.nextInt();
		
		System.out.print("Digite a quantidade do produto: ");
		int quantidade = teclado.nextInt();
		
		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.0;
		} 
		else if (codigo == 2) { 
			total = quantidade * 4.5;
		}
		else if (codigo == 3) {
			total = quantidade * 5.0;
		
		}
		else if (codigo == 4) {
			total = quantidade * 2.0;
		
	    }
		else if (codigo == 5) {
		    total = quantidade * 1.5;
		    
	    }
		else { 
	    	System.out.println("Codigo invalido! Tente novamente");
	    }
		
		System.out.printf("Total a pagar: R$ %.2f", total);
		
		teclado.close();
	}
	

}
