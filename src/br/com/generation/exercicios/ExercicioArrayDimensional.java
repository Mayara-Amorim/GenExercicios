package br.com.generation.exercicios;

import java.util.Scanner;

public class ExercicioArrayDimensional {

	public static void main(String[] args) {
// Exercicio 02)
		Scanner leia = new Scanner (System.in);
		double [][] notas = new double [2][4];
		double [] medias = new double [2];
		int linha, coluna;
		double media = 0, soma = 0;
		for(linha = 0; linha<2; linha++ ) {
			for(coluna =0; coluna<4; coluna++) {
				System.out.println("Digite uma nota: ");
				notas[linha][coluna] = leia.nextDouble();
				soma = soma + notas[linha][coluna];			
			}
			 media = soma/4;
			 medias[linha]= media;
			 
		}
		System.out.println("Soma: " + soma);
		for (int x =0; x < medias.length; x++){
			System.out.println("Media do aluno " + (x+1) + ": \t"+ medias[x]);
		}
		

	}

}
