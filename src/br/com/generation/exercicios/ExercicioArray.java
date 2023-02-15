package br.com.generation.exercicios;

import javax.swing.JOptionPane;

public class ExercicioArray {
//
	public static void main(String[] args) {
//		// Inserindo
//		int[] num = new int[5];
//		for (int x = 0; x < num.length; x++) {
//			num[x] = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero " + (x + 1) + " :"));
//
//		}
//		// Pesquisando
//		int pesquisa;
//		pesquisa = Integer
//				.valueOf(JOptionPane.showInputDialog("Qual numero de" + 
//		" determinado indice seja pesquisar? "));
//		for (int y = 0; y < num.length; y++) {
//			if (num[y] == pesquisa) {
//				System.out.println("Este numero se enconta na posição: " + y);
//				
//			} else if (num[y] != pesquisa) {
//
//				System.out.println("Este numero não existe!");
//			}
//		}
	
//Exercicio 02)
		
		int[] recebe = new int [3];
		int impar= 0, par= 0, soma= 0;
		double media = 0;
		
		for(int i= 0; i<recebe.length; i++) {
			recebe[i] = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero "
					+ "" + (i + 1) + " :"));
			soma += recebe[i];
			media = soma/ recebe.length;
			
			if(recebe[i] % 2 ==0) {
				par++;
			}else{
				impar++;
			}
			
		}
		System.out.println("Total de pares: " + par);
		System.out.println("Total de impares: " + impar);
		System.out.println("Soma:  " + soma);
		System.out.println("Media: " + media);
	}

}

