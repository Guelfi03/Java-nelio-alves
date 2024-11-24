package java_nelio_alves;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo pode
		 * começar em um dia e terminar em outro,
		 *  tendo uma duração mínima de 1 hora e máxima de 24 horas
		 */

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a hora que o jogo começou: ");
		int hora1 = teclado.nextInt();
		
		System.out.println("Digite a hora que o jogo acabou: ");
		int hora2 = teclado.nextInt();
		
		int duracao;
		if (hora1 < hora2) {
			duracao = hora2 - hora1;
		}
		else {
			duracao = 24 - hora1 + hora2;
			}
		
		System.out.printf("O jogo durou %d horas", duracao);
		
		teclado.close();
	}

}
