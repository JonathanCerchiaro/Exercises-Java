package application;

import java.util.Locale;
import java.util.Scanner;

import entities.contaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		contaBancaria contaBancaria;
		
		System.out.print("Enter account number: ");
        int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y' || response == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			contaBancaria = new contaBancaria(number, holder, initialDeposit);
		} else {
			contaBancaria = new contaBancaria(number, holder);
		}
		
		System.out.println();
		System.out.print("Account data: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		contaBancaria.deposit(depositValue);
		System.out.print("Updated account data: ");
		System.out.println(contaBancaria);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		contaBancaria.withdrah(withdrawValue);
		System.out.print("Updated account data: ");
		System.out.println(contaBancaria);
			
		sc.close();
	}

}
