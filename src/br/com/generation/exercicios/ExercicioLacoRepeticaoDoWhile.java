package br.com.generation.exercicios;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ExercicioLacoRepeticaoDoWhile {

	public static void main(String[] args) {
// Codig. Profº Luiz
//		int tabuada, x =1, res;
//		Scanner leia = new Scanner (System.in);
//		System.out.println("Entre com um numero de tabuada: ");
//		tabuada = leia.nextInt();
//		do {
//			res = tabuada * x;
//			System.out.println(tabuada + " X " + x + " = " + res);
//			x++;
//		}while(x<=10);

//Exercicio 01	
//		String nome = "Mayara";
//		String novo = nome.toUpperCase();
//		System.out.println(nome);
//		System.out.println(novo);
//		int [] numeros = new int [5];
//		numeros [0] = 1;
//		numeros [1] = 2;
//		int idades1 = numeros[6];
//		System.out.println(idades1); //Exception in thread "main"
		//java.lang.ArrayIndexOutOfBoundsException:
		
		Integer num;
		int x = 0;
		do{
			num = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero: "));
			if(num > 0) {
				x= x+ num;	
			}

			
		}while(num !=0);
		System.out.println("Quantidade de positivos: " + x);
	}

}
