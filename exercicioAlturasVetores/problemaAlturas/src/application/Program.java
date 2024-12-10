package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		Dados[] vect = new Dados[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.printf("Nome: ");
			String name = sc.nextLine();		
			System.out.printf("Idade: ");
			int age = sc.nextInt();
			System.out.printf("Altura: ");
			double hight = sc.nextDouble();
			sc.nextLine();
			vect[i] = new Dados(name, age, hight);
		}
		
		double sum = 0.0;
		for (int i=0; i<n; i++) {
			sum += vect[i].getHight();
		}
		double avg = 0.0;
		avg += sum / n;
		System.out.println();
		System.out.printf("Altura média: %.2f%n", avg);
		
		double percent;
		int cont = 0;
		for (int i=0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				cont = cont + 1;
			}
		}
		percent = cont * 100.0 / n;	
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);
		for (int i=0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		
		sc.close();
	}

}
