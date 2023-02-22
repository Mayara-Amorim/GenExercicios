package br.com.generation.exercicios.poo;

public class TesteExerciciosPOOClientesClassesMethodosAtributos {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Maria", "Rua da Flor", "maria@gmail.com","474.474.000.44", "(11) 9 9999 0000" );
		Cliente c2 = new Cliente("Dona Neta", "Rua das Araucarias", "netinha.fofsTuu@gmail.com","000.672.000.34", "(11) 9 8907 0050");
		c1.visualizar();
		c2.visualizar();

	}

}
