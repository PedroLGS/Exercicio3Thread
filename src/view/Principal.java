package view;

import controller.VetorController;

public class Principal {
	public static int vetor [] = new int [1000];
	
	public static void main(String[] args) {
		
		for (int i : vetor) {
			vetor[i] = (int) Math.random() * (100 - 1) + 1;
		}
		
		VetorController tv1 = new VetorController(1, vetor);
		VetorController tv2 = new VetorController(2, vetor);
		tv1.start();
		tv2.start();
	}
}