package Application;

import java.util.Locale;
import java.util.Scanner;

import Util.CurrencyConverter;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.print("What is the dollar price? ");
		double dolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double buyDolar = sc.nextDouble();
		double result = CurrencyConverter.dollarToReal(dolar, buyDolar);
		System.out.printf("Amount to be paid in reais = %.2f%n", result);
		
				
		sc.close();
	}

}
