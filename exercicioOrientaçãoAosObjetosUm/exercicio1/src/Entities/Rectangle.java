package Entities;

public class Rectangle {
 
	public double Width;
	public double Height;
	
	public double Area() {
	return  Width * Height;
	
	}
	
	public double Perimeter() {
	return 2.0 * (Width + Height);
	}
	
	public double Diagonal() {
	return	Math.sqrt(Height * Height + Width * Width);
		
	}
	
	public String toString() {
		return 
				"Area = " 
				+ String.format("%.2f", Width * Height)
			    + " Perimeter = "
			    + String.format("%.2f", 2.0 * (Width + Height))
			    + " Diagonal = " 
		        + String.format("%.2f", Math.sqrt(Height * Height + Width * Width));
	}
	
	
 }



