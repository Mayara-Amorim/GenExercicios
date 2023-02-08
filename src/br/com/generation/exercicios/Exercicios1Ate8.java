package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicios1Ate8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
//Exercicio 01)

		int idade, meses, dias, anos;
		System.out.println("Qual sua idade? ");
		idade= leia.nextInt();
		meses= idade * 12;
		dias= idade * 365;
		System.out.println("Sua idade em dias"
				+ " é: " + dias);
		
//Exercicio 02)
		System.out.println("Há quantos dias você nasceu? ");
		dias= leia.nextInt();
		anos= dias / 365;
		meses = anos * 12;
		System.out.println("Você nasceu há: " +
		anos + " e "+ meses +" meses.");
		
//Exercicio 03)
		
		double horas, minutos, segundos;
		
		System.out.println("Qual a duração do evento em segundos?");
		segundos= leia.nextDouble();
		minutos= segundos/ 60;
		horas= minutos/ 60;
		System.out.println("A duração do evento em minutos foi de: " +
		minutos + " e em horas foi de: " + horas);
		
//Exercicio 04)
		int a, b, c, d, r, s;
		
		System.out.println("Entre com um valor inteiro para A:");
		a = leia.nextInt();
		System.out.println("Entre com um valor inteiro para B:");
		b = leia.nextInt();
		System.out.println("Entre com um valor inteiro para C:");
		c = leia.nextInt();
		r= a + b;
		r= (int) Math.pow(r, 2);
		s= b+c;
		s=(int) Math.pow(s, 2);
		d= r + s / 2;
		System.out.println("O resultado da expressaõ foi " + d);
		
//Exercicio 05)	
		
		double nota1, nota2, nota3, media;
		System.out.println("Entre com a nota1:");
		nota1 = leia.nextDouble();
		System.out.println("Entre com a nota2:");
		nota2 = leia.nextDouble();
		System.out.println("Entre com a nota3:");
		nota3 = leia.nextDouble();
		media = (nota1* 2.3) + (nota2 * 5.0) + (nota3) / (2.3 + 5);
		System.out.println("A media ponderada foi " + media + " ,aproximadamente");
		
		
//Exercicio 06)	
		
		double pontoA, pontoB, x1, x2, y1, y2, dt;
		System.out.println("Entre com a x1: ");
		x1 = leia.nextDouble();
		System.out.println("Entre com a x2: ");
		x2 = leia.nextDouble();
		System.out.println("Entre com a y1: ");
		y1 = leia.nextDouble();
		System.out.println("Entre com a y2: ");
		y2 = leia.nextDouble();
		pontoA = (x2 - x1);
		pontoA = Math.pow(pontoA, 2);
		pontoB = (y2 - y1);
		pontoB = Math.pow(pontoB, 2);
		dt = pontoA + pontoB;
		dt = Math.sqrt(dt);		
		System.out.println("A distantancia foi " + dt + " , aproximadamente.");
		
		
//Exercicio 07)		
		
		double a1, b1, c1, d1, e1, f1, x, y;
		System.out.println("Entre com a a: ");
		a1 = leia.nextDouble();
		System.out.println("Entre com a b: ");
		b1 = leia.nextDouble();
		System.out.println("Entre com a c: ");
		c1 = leia.nextDouble();
		System.out.println("Entre com a d: ");
		d1 = leia.nextDouble();
		System.out.println("Entre com a e: ");
		e1 = leia.nextDouble();
		System.out.println("Entre com a f: ");
		f1 = leia.nextDouble();
		x= ((c1 * e1) - (b1 * f1)) / ((a1 * e1) - (b1 * d1));
		y= ((a1 * f1) - (c1 * d1)) / ((a1 * e1) - (b1 * b1));
		System.out.println("O resultado de x:" + x);
		System.out.println("O resultado de y:" + y);
		
//Exercicio 08)		
		double custoConsumidor, custoFabrica, porcentagemDistribuidor, impostos;
		
		System.out.println("Qual o preco de fabrica de seu veiculo?");
		custoFabrica = leia.nextDouble();
		impostos = (45/100) * custoFabrica;
		porcentagemDistribuidor = (28/100) * custoFabrica;
		custoConsumidor = custoFabrica + porcentagemDistribuidor + impostos;
		
		System.out.println("Seu carro custou aproximadamente " + custoConsumidor);
	}

}
