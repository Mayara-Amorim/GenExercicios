package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosControleFluxo {

	public static void main(String[] args) {
////Exercicio 01)
//		int a, b, c, soma;
		Scanner leia = new Scanner (System.in);
//		System.out.println("Digite um valor inteiro para A: ");
//		a = leia.nextInt();
//		System.out.println("Digite um valor inteiro para B: ");
//		b = leia.nextInt();
//		System.out.println("Digite um valor inteiro para C: ");
//		c = leia.nextInt();
//		soma = a + b;
//		
//		if(soma > c) {
//			System.out.println("A e B juntos s�o maiores que C");
//		}else if (soma < c){
//			System.out.println("A e B juntos s�o menores que C");
//		}else {
//			System.out.println("Os valores s�o iguais");
//		}
//		
////Exercicio 02)	
//		int n, positivo;
//		System.out.println("\nDigite um numero inteiro e descubra se ele"
//				+ " � positivo ou negativo: ");
//		n = leia.nextInt();
//		positivo = n%2;
//		if(positivo == 0 && n > 0) {
//			System.out.println("Este numero � par  e positivo:) ");
//		}else if (positivo == 0 && n < 0){
//			System.out.println("Este numero � par e negativo :( ");
//		}else if(positivo != 0 && n > 0) {
//			System.out.println("Este numero � impar  e positivo :) ");
//		}else if(positivo != 0 && n < 0) {
//			System.out.println("Este numero � impar  e negativo :( ");
//		}else {
//			System.out.println("N�O OUSE DIGITAR ZERO NOVAMENTEEE!!!");
//		}
//		

//Exercicio 03)	
		int idade;
		boolean doacao;
		String nome;
		System.out.println("Qual seu nome: ");
		nome = leia.next();
		System.out.println("Qual sua idade: ");
		idade = leia.nextInt();
		System.out.println("Ja doou?");
		doacao = leia.nextBoolean();
		if(idade >= 18 && idade <= 69) {
			if(doacao == true) {
				System.out.println(nome + ", pode doar");
			}else {
				System.out.println("N�o pode doar");
			}
		}

		
//Exercicio 04)
		
		
		
	}
	

}
