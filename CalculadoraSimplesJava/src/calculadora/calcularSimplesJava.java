package calculadora;

import java.util.Scanner;

public class calcularSimplesJava {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("---------- Apenas Uma Simples Calculadora Java -----------");
		System.out.println("---------- Calculadora de N�meros Inteiros ---------------");
		System.out.println("Digite um n�mero: ");
		double numero1 = entrada.nextDouble();
		System.out.println("Digite um segundo n�mero: ");
		double numero2 = entrada.nextDouble();
			
		System.out.println("-> Agora escolha uma opera��o:");
		System.out.println("01 - Soma");
		System.out.println("02 - Produto");
		System.out.println("03 - Quociente");
		System.out.println("04 - Subtra��o");
		System.out.println("05 - O resto da Divis�o");
		int op = entrada.nextInt();
			
		switch(op) {
			case 01:
				System.out.println("Soma: " + (numero1+numero2));
				break;
			case 02:
				System.out.println("Produto:" + (numero1*numero2));
				break;
			case 03:
				System.out.println("Quociente:" + (numero1/numero2));
				break;
			case 04:
				System.out.println("Subtra��o:" + (numero1-numero2));	
				break;
			case 05:
				System.out.println("O resto da Divis�o �:" + (numero1%numero2));
				break;
			default:
				System.out.println("A op��o digitada n�o � v�lida!");
		}
			
	}
}

