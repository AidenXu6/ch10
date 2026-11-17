public class Fraction{
//instance variables or fields or attributes
private int numerator, denominator;

//constructor
public Fraction () { //default
	numerator=1;
	denominator=1;
}

public Fraction (int n, int d){// parameterized constructior
numerator=n;
if (d!=0)
denominator=d;	
else{
	denominator=1;
	System.out.println("Error: Denominator cannot be 0");
	}					
}
//behaviour methods

}
