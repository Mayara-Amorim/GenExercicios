package br.com.generation.exercicios;

import java.util.Random;

public class Sorteio {

	public static void main(String[] args) {

		Random random = new Random();

		int numero = random.nextInt(6);
		System.out.println("O grupo sorteado foi: " + numero);

	}

}
