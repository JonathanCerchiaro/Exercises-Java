package Entities;

public class Studente {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
    public double finalGrade() {
    	return nota1 + nota2 + nota3;
    }
	
    public void passOrFailed(double finalGrade) {
    	if (finalGrade >= 60 ) {  
    		System.out.println("PASS");
    	} else {
    		System.out.println("FAILED");
    	}
    }
    
    public String toString() {
    	return "FINALGRADE = " 
               + finalGrade();
    }
}
