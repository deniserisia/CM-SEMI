package primeiraAtividade;

import java.util.Scanner;

public class velocidade {
	
	public static void main(String[] args ) {
		
	Scanner input = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite se era um carro ou caminhao:");
	
	String nome = entrada.next();
	
	double velocidadeMaximaDaPista =  Double.parseDouble( input.next());
	double veloDoMotorista = Double.parseDouble(input.next());		
	
	// Primeiras opera��es 
	double finalCarro = velocidadeMaximaDaPista / veloDoMotorista;
	double finalCaminhao = velocidadeMaximaDaPista / veloDoMotorista;
	
	// Segunda Opera��o 
	double peCar =  finalCarro * 0.10;
	double peCam = finalCaminhao * 0.05;
	
	if ( nome.equalsIgnoreCase("carro") && finalCarro != peCar) {
		System.out.printf(" Voc� ultrapassou os limites da vida - Carro!", peCar);
	}else { 
		System.out.printf(" Voc� caminhoneiro ultrapassou os limites da via! - Caminh�o", peCam);
	}
	
	}	
}
