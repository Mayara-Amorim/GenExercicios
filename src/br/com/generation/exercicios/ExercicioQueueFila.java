package br.com.generation.exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioQueueFila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		int escolha;
		String cliente;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("**********************************************");
			System.out.println("Para comecar, digite uma opção:\n" + "1- Adicionar cliente\n"
					+ "2- Listar todos os clientes\n" + "3- Chamar cliente\n" + "0- Sair");
			System.out.println("**********************************************\n");
			escolha = leia.nextInt();
			switch (escolha) {
			case 1:
				leia.nextLine();
				System.out.println("Digite o nome do cliete:\n");
				cliente = leia.nextLine();
				fila.add(cliente);
				break;
			case 2:
				System.out.println("Listando todos os clientes... \n");
				System.out.println(fila);
				break;
			case 3:
				if(fila.isEmpty()) {
					System.out.println("Não tem ninguem aqui!");
				}else {
					System.out.println("Chamando o cliente: ");
				System.out.println(fila.poll());
				
				}
				
				break;
			case 0:
				System.out.println("Obrigado, este programa será terminado...");
				break;
			default:
				System.out.println("Escolha um valor valido");;
			}

		} while (escolha != 0);

	}
}
