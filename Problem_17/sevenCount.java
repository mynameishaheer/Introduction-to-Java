
public class sevenCount {

	public static void main(String[] args) {
		StdOut.println("Please Enter Number: ");
		int num = StdIn.readInt();
		StdOut.println(count(num));
	}
	public static int count (int n) {
		if (n == 0) 
			return 0 ;
		
		int temp = n % 10;
		if (temp % 7 == 0)
			return 1 + count(n/10);
		else
			return 0 + count (n/10);
	}
}
