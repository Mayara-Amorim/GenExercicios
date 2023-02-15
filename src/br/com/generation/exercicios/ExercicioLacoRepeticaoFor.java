package br.com.generation.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioLacoRepeticaoFor {

	public static void main(String[] args) {
//Exercicio 01)
	
		int n1, n2, x;
		Scanner leia = new Scanner (System.in);
		System.out.println("Entre com um numero: ");
		n1 = leia.nextInt();
		System.out.println("Entre com outro numero: ");
		n2 = leia.nextInt();
		
		if(n1>=n2) {
			System.out.println("O intervalo é inválido");
		}else {
			for(x=0; x<=n2; x=x+15) {
				System.out.println(x + " é um numero multiplo de 3 e 5.");
			}
			
		}
		
//Exercicio 02)
//		Array:
//		ArrayList <Integer> idades = new ArrayList<>();
		int[] idades = new int[10];
		for (int i = 0; i < 10; i++) {
//		idades.add(Integer.valueOf(JOptionPane.showInputDialog("Digite o numero: " + (i+1) + ": "));
			idades[i] = Integer.valueOf(JOptionPane.showInputDialog("" 
		+ "Digite uma idade " + (i + 1) + ": "));
		}

		int par = 0, impar = 0;
							//idades.size(); x1++
		for (int x1 = 0; x1 < idades.length; x1++) {
			if (idades[x1] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		System.out.println("Total de pares: " + par);
		System.out.println("Total de impares: " + impar);
	}
}


