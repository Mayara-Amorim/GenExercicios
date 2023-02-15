package br.com.generation.exercicios;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExerciciosExtrasDOWHILE {

	public static void main(String[] args) {
//Exercicio 01)
//		int num, x = 0;
//		do{
//			num = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero: "));
//			if(num > 0) {
//				x += num;
//			}
//			
//		}while(num != 0);
		
//Exercicio 02)
		
		int recebeNum, media = 0, z= 0;
		ArrayList<Integer> guardaNum = new ArrayList <>();
		
		do {
		recebeNum = Integer.valueOf(JOptionPane.showInputDialog("Digite um numero: \nPara sair digite 0 (zero)"));
		if(recebeNum> 0 && recebeNum % 3== 0) {
			guardaNum.add(recebeNum);
			for( z = 0; z< guardaNum.size(); z++) {
				z += guardaNum.get(z);
			}
			
			
			media = z / guardaNum.size();
		}System.out.println("A media foi dos multiplos de 3: " + media);
			
		}while(recebeNum != 0);

	}

}
