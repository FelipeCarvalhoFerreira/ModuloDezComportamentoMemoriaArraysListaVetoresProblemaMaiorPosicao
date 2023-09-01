package ModuloDezComportamentoMemoriaArraysListaVetoresProblemaMaiorPosicao;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double maiorVect;
		int posicao;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		double vect [] = new double [n];
		
		for (int i = 0; i < n; i ++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		
		maiorVect = vect[0];
		posicao = 0;
		
		System.out.print("MAIOR VALOR = ");
		for (int i = 0; i < n; i ++) {
			if (vect[i] > maiorVect) {
				
				maiorVect = vect[i];
				posicao = i;
				
			}
			
		}
		System.out.printf("MAIOR VALOR = %.1f\n", maiorVect);
	    System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
		
		sc.close();

	}

}
