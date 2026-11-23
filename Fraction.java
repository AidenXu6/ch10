public class Fraction {
    private int numerator, denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator cannot be zero");
        }
    }
    
    public static Fraction subtract (Fraction a, Fraction b){
		int ansd=a.numerator*b.denominator;
		int ansn=b.numerator*a.denominator;
		int ansdf=a.denominator*b.denominator;
		int ansnf=ansd-ansn;
		int gcf= GCF(ansnf,ansdf);
		System.out.println("Greatest common factor : " +gcf);
		ansnf=ansnf/gcf;
		ansdf=ansdf/gcf;
		Fraction ans = new Fraction(ansnf,ansdf); 
		return ans;
	}
	
	public static Fraction divide (Fraction a, Fraction b){
	 int ansn=a.numerator*b.denominator;
     int ansd=a.denominator*b.numerator;
     int  gcf = GCF(ansn,ansd);
     System.out.println("Greatest common factor : "+gcf);
     ansn=ansn/gcf;
     ansd=ansd/gcf;
		Fraction ans = new Fraction(ansn,ansd);
		return ans;	
	}
    
    public static Fraction mult(Fraction a, Fraction b){
    int ansn=a.numerator*b.numerator;
     int ansd=a.denominator*b.denominator;
     int  gcf = GCF(ansn,ansd);
     System.out.println("Greatest common factor : "+gcf);
     ansn=ansn/gcf;
     ansd=ansd/gcf;
		Fraction ans = new Fraction(ansn,ansd);
		return ans;
    }
    
        public static Fraction add(Fraction a, Fraction b){
		int ansd=a.numerator*b.denominator;
		int ansn=b.numerator*a.denominator;
		int ansdf=a.denominator*b.denominator;
		int ansnf=ansd+ansn;
		int  gcf= GCF(ansnf,ansdf);
		System.out.println("Greatest common factor : " +gcf);
		ansnf=ansnf/gcf;
		ansdf=ansdf/gcf;
		Fraction ans = new Fraction(ansnf,ansdf); 
		return ans;
    }

    public Fraction(String s) {
        int ind = s.indexOf('/');
        String n = s.substring(0, ind);
        String d = s.substring(ind, s.length());
        int numerator = Integer.parseInt(n);
        int denominator = Integer.parseInt(d);
    }

    // accessor methods
    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return  (double) numerator/denominator; 
    }
    public int getNum() {
        return numerator;
    }
    public int getDenom() {
        return denominator;
    }

    // mutator method
    public void setNum(int n) {
        numerator = n;
    }
    
    public static int GCF(int a, int b) {
		int phold= 0;
        while(phold== 0){

			if (a>b){
				a = a-b;

			}else if(b>a){
				b = b-a;
			}else{
				phold= 1;				
			}
		}
		return a;
    }

    public void setDenom(int d) {
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator cannot be zero");
        }
    }
}
