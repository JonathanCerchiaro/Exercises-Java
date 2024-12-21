package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
        double[] altura = new double[n];
        char[] genero = new char[n];
        
        for(int i=0; i<n; i++) {
        	System.out.print("Altura da " + (i+1) + "a pessoa: ");
        	altura[i] = sc.nextDouble();
        	System.out.print("Genero da " + (i+1) + "a pessoa: ");
        	genero[i] = sc.next().charAt(0);
        }
        
        double menorAltura = Double.MAX_VALUE;
        System.out.print("Menor altura = ");
        for(int i=0; i<n; i++) {
        	if (altura[i] < menorAltura) {
        		menorAltura = altura[i];
        	}
        }
		System.out.printf("%.2f\n",menorAltura);
		
		double maiorAltura = Double.MIN_VALUE;
		System.out.print("Maior altura = ");
		for(int i=0; i<n; i++) {
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
		}
		System.out.printf("%.2f\n", maiorAltura);
		
		double media = 0.0;
		double soma = 0.0;
		int contMulheres = 0;
		System.out.print("Media das alturas das mulheres = ");
		for(int i=0; i<n; i++) {
			if (genero[i] == 'F') {
				soma += altura[i];
				contMulheres++;
			}
		}
		if (contMulheres > 0) {
			media = soma / contMulheres;
		}
		System.out.printf("%.2f\n", media);
		
		int contHomens = 0;
		for (int i=0; i<n; i++) {
			if (genero[i] == 'M') {
				contHomens ++;
			}
		}	
		System.out.print("Numero de homens = ");
		System.out.print(contHomens);
		
		sc.close();
	}
}
