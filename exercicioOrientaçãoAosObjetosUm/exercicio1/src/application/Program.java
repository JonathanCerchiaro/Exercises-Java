package application;

import java.util.Locale;

import java.util.Scanner;

import Entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();	
		
		System.out.println(rectangle);
		
		sc.close();
	}

}
