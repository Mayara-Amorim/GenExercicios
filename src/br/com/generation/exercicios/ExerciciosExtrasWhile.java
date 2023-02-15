package br.com.generation.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExerciciosExtrasWhile {

	public static void main(String[] args) {
//Exercicio 01)
//		int maiores =0, menores=0, idades= 0;
//		while(idades != -99) { 
//		idades = Integer.valueOf(JOptionPane.showInputDialog("Digite uma idade: "));
//			if(idades <21 && idades != 0 ){
//				menores++;
//			}else if(idades >50 && idades > 0) {
//				maiores++;
//			}
//		}
//		System.out.println("A quantidade de pessoas com mais de 50 é: "+ maiores);
//		System.out.println("A quantidade de pessoas com menos de 21 é: "+ menores);
//		
//		
//	Exercicio 02 ou 4)
		int x = 0;
		int calmas= 0;
		int outrosCalmos = 0;
		int mNervosas = 0;
		int hAgressivos = 0;
		int maioresNervosos = 0;
		int menoresCalmos = 0;
		int mulheresCalmas = 0;
		int homensCalmos = 0;
		
		while(x < 10 ) {
			Integer pIdade = Integer.valueOf(JOptionPane.showInputDialog("Qual sua idade?"));
			Integer pGenero= Integer.valueOf(JOptionPane.showInputDialog("Qual sua Genero?\n"
					+ "1- Feminino\n"
					+ "2 - Masculino\n"
					+ "3 - Outros\n"));
			
			
			Integer pTemperamento= Integer.valueOf(JOptionPane.showInputDialog("Qual sua Temperamento?"
					+ "1 - \nCalmo(a)\n"
					+ "2 - Nervoso\n"
					+ "3 - Agressivo(a)\n"));
			
			if(pTemperamento == 1 && pGenero == 3) {
				outrosCalmos++;
			}else if(pGenero == 1 && pTemperamento == 2){
				mNervosas  ++;
				if(pTemperamento == 1) {
					mulheresCalmas++;
				}
			 if(pIdade > 40){
				 maioresNervosos++;
			 }else {
				 menoresCalmos++;
			 }
			}else if(pGenero == 2 && pTemperamento == 3) {
				hAgressivos ++;
				if(pTemperamento ==1) {
					homensCalmos++;
				}
				else if(pIdade >40) {
					maioresNervosos++;
				}else {
					menoresCalmos++;
				}
			}else if(pIdade > 40 && pTemperamento == 2) {
				maioresNervosos++;
			}else if(pIdade < 18 && pTemperamento == 1) {
				menoresCalmos++;
			}
			
			calmas = outrosCalmos + menoresCalmos + mulheresCalmas + homensCalmos;
			
		}
		System.out.println("Pesoas calmas: " + calmas);
		System.out.println("Mulheres nervosas: " + mNervosas);
		System.out.println("Homens agressivos: " + hAgressivos);
		System.out.println("Outros calmos: " + outrosCalmos);
		System.out.println("Pesoas calmas: " + calmas);
		System.out.println("Mais de 40 anos estressados " + maioresNervosos);
		System.out.println("Menores de 18 anos calmos" + menoresCalmos);
		
		
		
	}

}
