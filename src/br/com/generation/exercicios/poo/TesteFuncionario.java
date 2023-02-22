package br.com.generation.exercicios.poo;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario ("Fabiano Madera", "fabiano_Madeira@gmail.com", "474.648.088-51", "Av. Lins de Vasconcelos, Cambucci", "CLT" );
		Funcionario f2 = new Funcionario ("Henrique Poyatos", "poyatos.professor@gmail.com", "476.832.050-82", "Av. Lins de Vasconcelos, Cambucci", "CLT" );
		f1.visualizar();
		f2.visualizar();
		f1.setNome("Leandro Rubim");
		System.out.println("Novo nome do funcionario 1: " + f1.getNome());
	}

}
