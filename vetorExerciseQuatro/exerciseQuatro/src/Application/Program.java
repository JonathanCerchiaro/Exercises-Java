package Application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double [n];
		
		
		for(int i=0; i<vect.length; i++) {
		System.out.print("Digite um numero: ");
		vect[i] = sc.nextDouble();		
		}
		System.out.println();
		
		System.out.print("VALORES = ");
		for(int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		
		double soma = 0;
		System.out.print("SOMA = ");
		for(int i=0; i<n; i++) {
			soma += vect[i];
		}
		System.out.printf("%.2f", soma); 
        System.out.println();
        
    	double media; 
    	media = soma / n;
    	System.out.printf("MEDIA = %.2f", media);
	

		
		sc.close();
	}
}
