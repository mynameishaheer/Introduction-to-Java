
public class sumToRec {

	public static void main(String[] args) {
		
		StdOut.println("Please Enter Number: ");
		int num = StdIn.readInt();
		StdOut.println(sumTo(num));
	}
	public static double sumTo(double n) {
		if (n==1) return 1;
		if (n==0) return 0;
		
		return 1/n + sumTo(n-1);
	}
	
}
