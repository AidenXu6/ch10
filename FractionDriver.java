public class FractionDriver{
	
public static void main(String []args){
Fraction f1= new Fraction(1,2);
Fraction f2= new Fraction(1,3);
Fraction half = new Fraction(1,2);
Fraction third = new Fraction (1,3);
Fraction f3=Fraction.divide(half,third);
System.out.println(f3);
}

}
