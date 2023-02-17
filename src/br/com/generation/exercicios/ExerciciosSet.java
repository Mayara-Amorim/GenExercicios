package br.com.generation.exercicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExerciciosSet {

	public static void main(String[] args) {

		Stack<String> estante = new Stack<String>();
		Scanner leia = new Scanner(System.in);

		int opcao;
		String livro;

		do {
			System.out.println("Digite uma opção:\n" 
		+ "1- \nAdicionar um livro\n" 
		+ "2- Listar todos os livros\n"
		+ "3- Retirar um livro\n" 
		+ "0- Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o livro que quer adicionar:\n");
				livro = leia.nextLine();
				estante.push(livro);
				System.out.println("Livro " + livro + " adicionado");

				break;
			case 2:
				if (estante.isEmpty()) {
					System.out.println("A estante está vazia, adicione" + 
				" um livro antes.");
				} else {
					System.out.println("Lista de todos os livros:\n");
					Iterator<String> i = estante.iterator();
					while (i.hasNext()) {
						System.out.println(i.next());
					}
				}
				break;
			case 3:
				System.out.println("Okay, retiramos um livro para você!"
						+ "\nO livro retirado será o " + estante.pop());
				break;
			case 0:
				System.out.println("Obrigado, este programa será terminado...");
				break;
			default:
				System.out.println("Digite um valor valido");
			}

		} while (opcao != 0);

	}

}
