package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicios1Ate4 {

	public static void main(String[] args) {
//Exercicio 1:
		
		double salario, abono, novoSalario;
		Scanner leia = new Scanner(System.in);
		System.out.println("Por favor, digite seu salario: ");
		salario = leia.nextDouble();
		System.out.println("Por favor, digite agora o valor do abono: ");
		abono = leia.nextDouble();
		novoSalario = salario + abono;
		System.out.println("Parabens, o seu salario é igual a: " + novoSalario);
		
//	****************************************************************************	

//Exercicio 2:
		
		
		double nota1, nota2, nota3, nota4, media;
		System.out.println("Por favor, digite a primeira nota: ");
		nota1= leia.nextDouble();
		System.out.println("Por favor, digite a segundaa nota: ");
		nota2= leia.nextDouble();
		System.out.println("Por favor, digite a terceira nota: ");
		nota3= leia.nextDouble();
		System.out.println("Por favor, digite a quarta nota: ");
		nota4= leia.nextDouble();
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("A média foi de: " + media);
		
//		****************************************************************************	

//Exercicio 3:
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Por favor, digite o Salario: ");
		salarioBruto= leia.nextFloat();
		System.out.println("Por favor, digite o adicional noturno: ");
		adicionalNoturno= leia.nextFloat();
		System.out.println("Por favor, digite as horas extras: ");
		horasExtras= leia.nextFloat();
		System.out.println("Por ultimo, digite os descontos: ");
		descontos= leia.nextFloat();
		salarioLiquido= horasExtras * 5 + salarioBruto + adicionalNoturno - descontos;
		System.out.println("O salario foi de: " + salarioLiquido);
		
//		****************************************************************************	

//Exercicio 4:		
		int n1, n2, n3, n4, diferenca;
		
		System.out.println("Entre com o primeiro valor: ");
		n1= leia.nextInt();
		System.out.println("Entre com o segundo valor: ");
		n2= leia.nextInt();
		System.out.println("Entre com o terceiro valor: ");
		n3= leia.nextInt();
		System.out.println("Entre com o quarto valor: ");
		n4= leia.nextInt();
		diferenca= (n1*n2) - (n3*n4);
		System.out.println("Perfeito, a diferença entre os produtos foi de: "
				+ diferenca);
		
		
		
		
		
		
		
		
	}

}
