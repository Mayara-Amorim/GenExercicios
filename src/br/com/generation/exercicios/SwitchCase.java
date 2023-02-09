package br.com.generation.exercicios;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int op;
	Scanner leia = new Scanner (System.in);
	System.out.println("\n\t\tMENU");
	System.out.println("\nSensacional");
	System.out.println("\nIncrivel");
	System.out.println("\nMaravilhosa");
	System.out.println("\nLegal");
	op = leia.nextInt();
	switch (op) {
	case 1:
		System.out.println("\nSensacional");
		break;
	case 2:
		System.out.println("\nIncrivel");
		break;
		
	case 3:
		System.out.println("\nMaravilhosa");
		break;
		
	case 4:
		System.out.println("\nLegal");
		break;
	default:
		System.out.println("Opcão invalida!");
	}
	
	}

}
