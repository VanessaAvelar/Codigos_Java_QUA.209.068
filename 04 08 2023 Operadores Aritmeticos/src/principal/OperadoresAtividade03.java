package principal;

import java.util.Scanner;

public class OperadoresAtividade03 {
	/*Fa�a um Programa que pergunte quanto voc� ganha por hora e o 
	 * n�mero de horas trabalhadas no m�s. Calcule e mostre o total 
	 * do seu sal�rio no referido m�s (sem descontos e impostos).
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		

		System.out.println("Digite o valor da sua hora aula: ");
		double numero1 = sc.nextDouble();
		
		System.out.println("Digite as horas trabalhadas no m�s: ");
		double numero2 = sc.nextDouble();
		
		double multiplicacao = numero1 * numero2;
		
		System.out.println("O  valor � receber �: " + multiplicacao);
		
		sc.close();
	}
	
	

}
