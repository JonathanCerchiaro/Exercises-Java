package Notes;

import java.util.Locale;
import java.util.Scanner;

import Entities.Studente;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Studente stu = new Studente();
		
		stu.name = sc.nextLine();
		stu.nota1 = sc.nextDouble();
		stu.nota2 = sc.nextDouble();
		stu.nota3 = sc.nextDouble();
			
		System.out.print(stu);

	

	}

}
