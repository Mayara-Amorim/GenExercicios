package br.com.gen.codigos.professorLuis;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionsArrayListCRUD {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int op;
		ArrayList<String> estoque = new ArrayList<>();
		do {

			System.out.println("\n-------------------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do sistema de estoque?");
			System.out.println("\n-------------------------------------------------");
			System.out.println("\nPor favor, digite sua op��o: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover: ");
				String produtor = leia.nextLine();
				if (estoque.contains(produtor)) {
					estoque.remove(produtor);
				} else {
					System.out.println("\nProduto n�o existe!!!");
				}
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o nome do produto que voc� quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o nome do produto que entrar� no lugar do " + verifica + " :");
				String novo = leia.nextLine();

				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				} else {
					System.out.println("\nProduto n�o existe!!!");
				}
				break;
			case 4:
				System.out.println("\nOs produtos do estoque s�o: ");
				System.out.println(estoque);
				break;
			case 0:
				System.out.println("\nMuito obrigado em utilizar do nosso sistema, volte sempre!!!");
				break;
			default:
				System.out.println("\nOp��o inv�lida!!!");

			}

		} while (op != 0);
	}

}
