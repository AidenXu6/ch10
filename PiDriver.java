public class PiDriver {
    public static void main(String[] args) {
        Pi f1 = new Pi(1, 2);
        Pi f2 = new Pi(1, 3);
        Pi half = new Pi(1, 2);
        Pi third = new Pi(1, 3);
        Pi f3 = Pi.divide(half, third);
        Pi MILU = new Pi(355, 113);
        final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
        Pi approximation = new Pi(3, 1);
        while(approximation.toDouble()!=(double) 52163/16604){
if (approximation.toDouble()>Math.PI){
	approximation.setDenom(approximation.getDenom()+1);
}
else if (approximation.toDouble()<Math.PI){
	approximation.setNum(approximation.getNum()+1);
}
}
  System.out.print(approximation);
    }

}
