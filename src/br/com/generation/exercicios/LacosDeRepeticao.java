package br.com.generation.exercicios;

import java.util.Scanner;

public class LacosDeRepeticao {

	public static void main(String[] args) {
		float n1, n2, n3, n4, media, somaMedia= 0, mG;
		int x;
		Scanner leia = new Scanner (System.in);
		for(x=1; x<=4; x++) {
			System.out.println("Entre com a nota do aluno1: ");
			n1 = leia.nextFloat();
			System.out.println("Entre com a nota do aluno2: ");
			n2 = leia.nextFloat();
			System.out.println("Entre com a nota do aluno3: ");
			n3 = leia.nextFloat();
			System.out.println("Entre com a nota do aluno4: ");
			n4 = leia.nextFloat();
			media = (n1+n2+n3+n4) / 4;
			System.out.println("A media do aluno " + x + " foi de " + media);
			
			somaMedia +=media;
		}
			mG = somaMedia /4;
			System.out.println("A media geral:");
			
	}

}
