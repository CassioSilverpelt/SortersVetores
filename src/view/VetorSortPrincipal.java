package view;

import javax.swing.JOptionPane;
import controller.VetorSortController;

public class VetorSortPrincipal {

	public static void main(String[] args) {
		int[] vetor1 = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		int[] vetor2 = {44, 43, 42, 41, 40, 39, 38};
		int[] vetor3 = {31, 32, 33, 34, 99, 98, 97, 96};
		int opc = 0;
		
		VetorSortController vetsorCon = new VetorSortController();
		
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"====================================\n"
					+ "=====Selecione a operação desejada=====\n"
					+ "1 - Bubble Sort\n"
					+ "2 - Merge Sort\n"
					+ "3 - Quick Sort\n"
					+ "9 - Sair.\n"
					+ "===================================="));
			switch (opc) {
				case 1:
					vetsorCon.bubbleSort(vetsorCon.selectVetor(vetor1, vetor2, vetor3));
					break;
				case 2:
					vetsorCon.mergeSort(vetsorCon.selectVetor(vetor1, vetor2, vetor3));
					break;
				case 3:
					vetsorCon.quickSort(vetsorCon.selectVetor(vetor1, vetor2, vetor3));
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "Saindo.");
					break;
			}
		}
	}
}
