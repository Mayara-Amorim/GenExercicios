package br.com.generation.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExercicioLacoRepeticaoWhile {

	public static void main(String[] args) {
// Codig. Profº Luiz
//		int num, somaPar =0;
//		Scanner leia = new Scanner(System.in);
//		num = leia.nextInt(); 
//		while(num !=99) {
//			if (num %2 == 0) {
//				somaPar= somaPar + num;
//			}
//		}
//		System.out.println("Entre com um numero: ");
//		num = leia.nextInt();

		int idade = 1, maior = 0, menor = 0;
		
		while (idade > 0) {
		
		idade = Integer.valueOf(JOptionPane.showInputDialog("Digite uma idade "));
			if(idade<21 && idade>0) {
				menor++;
			}else if (idade >50 && idade>0) {
				maior++;
			}
		}
		System.out.println("Menores de 21: " + menor);
		System.out.println("Com mais de 50: " + maior);
	}

}
