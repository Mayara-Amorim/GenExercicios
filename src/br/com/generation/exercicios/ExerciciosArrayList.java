package br.com.generation.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

public class ExerciciosArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>();
		for (int i = 0; cores.size() < 5; i++) {
			cores.add(String.valueOf(JOptionPane.showInputDialog((i + 1) + "- Escreva uma cor:")));
		}
		// Mostrando a lista
		for (String cor : cores) {
			System.out.println(cor);
		}
		// Ordenando
		Collections.sort(cores);
		System.out.println("Cores ordenadas: \n\t\t" + cores);

	}

}
