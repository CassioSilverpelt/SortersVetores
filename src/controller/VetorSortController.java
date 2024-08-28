package controller;

import javax.swing.JOptionPane;
import cassio.sorters.SorterControllers;

public class VetorSortController {
	public VetorSortController() {
		super();
	}
	SorterControllers sortCon = new SorterControllers();
	
	public int[] bubbleSort(int[] vetor) {
		vetor = sortCon.bubbleSort(vetor);
		for (int a : vetor) {
			System.out.print(a + " ");
		}
		System.out.println();
		return vetor;
	}
	
	public int[] mergeSort(int[] vetor) {
		vetor = sortCon.mergeSort(vetor, 0, vetor.length-1);
		for (int a : vetor) {
			System.out.print(a + " ");
		}
		System.out.println();
		return vetor;
	}
	
	public int[] quickSort(int[] vetor) {
		vetor = sortCon.quickSort(vetor, 0, vetor.length-1);
		for (int a : vetor) {
			System.out.print(a + " ");
		}
		System.out.println();
		return vetor;
	}
	
	public int[] selectVetor(int[] vet1, int[]vet2, int[] vet3) {
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"==================================\n"
					+ "=Escolha qual vetor você quer usar=\n"
					+ "1 - {74, 20, 74, 87, 81, 16, 25, 99, 44, 58}\n"
					+ "2 - {44, 43, 42, 41, 40, 39, 38}\n"
					+ "3 - {31, 32, 33, 34, 99, 98, 97, 96}\n"
					+ "9 - Sair.\n"
					+ "==================================\n"));
			switch (opc) {
				case 1:
					return vet1;
				case 2:
					return vet2;
				case 3:
					return vet3;
				case 9:
					JOptionPane.showMessageDialog(null, "Nenhum vetor selecionado.");
					break;
			}
		}
		int[] vet = {0};
		return vet;
	}
}
