package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
		double[] vect = new double[n];
		  
        for(int i=0; i<n; i++) {
          System.out.print("Digite um numero: ");
          vect[i] = sc.nextDouble();
        }
        
        double soma = 0.0;
        
        for(int i=0; i<n; i++) {
        	soma += vect[i]; 
        }
        System.out.println();
        
        double media;
        
        media = soma / n;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i=0; i<n; i++) {
        	if(vect[i] < media) {
        		System.out.print(vect[i]);
        	}
        }
            
		sc.close();		
	}
}