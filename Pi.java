public class Pi {
    private int numerator, denominator;

    public Pi() {
        numerator = 1;
        denominator = 1;
    }

    public Pi(int n, int d) {
        numerator = n;
        if (d != 0)
            denominator = d;
        else {
            denominator = 1;
            System.out.println("Error: Denominator cannot be zero");
        }
    }
    
    public static Pi subtract (Pi a, Pi b){
		int ansd=a.numerator*b.denominator;
		int ansn=b.numerator*a.denominator;
		int ansdf=a.denominator*b.denominator;
		int ansnf=ansd-ansn;
		int gcf= GCF(ansnf,ansdf);
	
		ansnf=ansnf/gcf;
		ansdf=ansdf/gcf;
		Pi ans = new Pi(ansnf,ansdf); 
		return ans;
	}
	
	public static Pi divide (Pi a, Pi b){
	 int ansn=a.numerator*b.denominator;
     int ansd=a.denominator*b.numerator;
     int  gcf = GCF(ansn,ansd);
  
     ansn=ansn/gcf;
     ansd=ansd/gcf;
		Pi ans = new Pi(ansn,ansd);
		return ans;	
	}
    
    public static Pi mult(Pi a, Pi b){
    int ansn=a.numerator*b.numerator;
     int ansd=a.denominator*b.denominator;
     int  gcf = GCF(ansn,ansd);

     ansn=ansn/gcf;
     ansd=ansd/gcf;
		Pi ans = new Pi(ansn,ansd);
		return ans;
    }
    
        public static Pi add(Pi a, Pi b){
		int ansd=a.numerator*b.denominator;
		int ansn=b.numerator*a.denominator;
		int ansdf=a.denominator*b.denominator;
		int ansnf=ansd+ansn;
		int  gcf= GCF(ansnf,ansdf);
		ansnf=ansnf/gcf;
		ansdf=ansdf/gcf;
		Pi ans = new Pi(ansnf,ansdf); 
		return ans;
    }

    public Pi(String s) {
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
