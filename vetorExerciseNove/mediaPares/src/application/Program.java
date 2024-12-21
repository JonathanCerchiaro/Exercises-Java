package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		double soma = 0.0;
		int cont = 0;
		for(int i=0; i<n; i++) {
			if (vect[i] % 2 == 0) {
				soma += vect[i];
				cont++;
			} 
		}
		
		double media;
		if (cont == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = (double) soma / cont;		
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
			
		sc.close();
	}

}
