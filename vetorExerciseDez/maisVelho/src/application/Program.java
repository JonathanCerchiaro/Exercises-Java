package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		sc.nextLine();
		String[] name = new String[n];
		int[] height = new int[n];
		

		for(int i=0; i<n; i++) {
			System.out.println("Dados da " + (i + 1) +"a pessoa:");
			System.out.print("Nome: ");
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			height[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maiorIdade = height[0];
		int cont = 0;
		for(int i=0; i<n; i++) {
			if (height[i] > maiorIdade) {
                    maiorIdade = height[i];
                    cont = i;
 			}
		}		
		System.out.printf("PESSOA MAIS VELHA: %s%n", name[cont]);
			
		sc.close();
	}

}
