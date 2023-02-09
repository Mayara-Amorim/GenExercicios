package br.com.generation.exercicios;

import java.util.Scanner;

public class ExerciciosSwitchCase {

	public static void main(String[] args) {
//Exercicio 01)

	Scanner leia = new Scanner (System.in);
	
//	double preco, total;
//	int quantidade, pedido;
//	System.out.println("Menu:");
//	System.out.println(
//			"Cachorro Quente 10,00\n"
//			+ "X Salada 15,00\n"
//			+ "X Bacon 18,00\n"
//			+ "Bauru 12,00\n" + "Refrigerante 8,00\n" + 
//			"Suco Laranja 13,00\n");
//	
//	System.out.println("Qual se pedido");
//	pedido = leia.nextInt();
//	System.out.println("Qual a quantidade?");
//	quantidade = leia.nextInt();
//	switch (pedido) {
//	case 1: 
//		preco= 10.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" Cachorro Q(s)\n"
//				+ " O total foi de " + total);
//		break;
//	case 2: 
//		preco= 15.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" X Salada(s)\n"
//				+ " O total foi de " + total);
//		break;
//	case 3: 
//		preco= 18.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" X Bacon(s)\n"
//				+ " O total foi de " + total);
//		break;
//	case 4: 
//		preco= 12.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" Bauru(s)\n"
//				+ " O total foi de " + total);
//		break;
//	case 5: 
//		preco= 08.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" Refri(s)\n"
//				+ " O total foi de " + total);
//		break;
//	case 6: 
//		preco= 13.0;
//		total= preco * quantidade;
//		System.out.println("Voce pediu " + quantidade +" Suco(s) de Laranja(s)\n"
//				+ " O total foi de " + total);
//		break;
//		
//		default:
//			System.out.println("Unexpected value: ");
//	}
	String nome;
	int codigo;
	float salario, reajuste, novoSalario;
	System.out.println("Lembranças para o RH: ");
	System.out.println(
			"CD 1 - Gerente \n"
			+"CD 2 - Vendedor\n"
			+"CD 3 - Supervisor \n"
			+"CD 4 - Motorista \n" + "CD 5 - Estoquista\n" + 
			"CD 6 -  Tec. TI\n");
	System.out.println("Qual seu nome: ");
	nome = leia.next();
	System.out.println("Deseja ver qual cargo?");
	codigo = leia.nextInt();
	switch (codigo) {
	case 1:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.10F ;
		novoSalario = reajuste + salario;
		System.out.println(novoSalario);
		System.out.println(nome+" , o salário do gerente é de: " + novoSalario);
		break;
	case 2:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.07F ;
		novoSalario = salario + reajuste;
		System.out.println(nome+" , o salário do vendedor é de: " + novoSalario);
		break;
	case 3:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.09F;
		novoSalario = salario + reajuste;
		System.out.println(nome+" , o salário do supervisor é de: " + novoSalario);
		break;
	case 4:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.06F;
		novoSalario = salario + reajuste;
		System.out.println(nome+" , o salário do motorista é de: " + novoSalario);
		break;
	case 5:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.05F;
		novoSalario = salario + reajuste;
		System.out.println(nome + " , o salário do estoquista é de: " + novoSalario);
		break;
	case 6:
		System.out.println("O valor do salario");
		salario = leia.nextFloat();
		reajuste = salario * 0.08F;
		novoSalario = salario + reajuste;
		System.out.println(nome + " , o salário do tecnico de TI é de: " + novoSalario);
		break;
		default:
			System.out.println("Opcão invalida");
	}
	
	}
	
	
	

}
