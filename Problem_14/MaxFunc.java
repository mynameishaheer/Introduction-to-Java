
public class MaxFunc {

	public static void main(String[] args) {
		StdOut.println("1 = Double Values: ");
		StdOut.println("2 = Integer Values: ");
		int type = StdIn.readInt();
		
		if(type == 1) {
			StdOut.print("Enter 3 Double Values: ");	
			double n = StdIn.readDouble();
			double m = StdIn.readDouble();
			double p = StdIn.readDouble();
			
			StdOut.println("The Higest Value is: ");
			StdOut.println(max(n,m,p));
		}
		else if (type == 2) {
			StdOut.print("Enter 3 Integer Values: ");	
			int n = StdIn.readInt();
			int m = StdIn.readInt();
			int p = StdIn.readInt();
		
			StdOut.println("The Higest Value is: ");
			StdOut.println(max(n,m,p));
		}

	}
	public static double max(double a, double b, double c) { 
		double max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
	public static int max(int a, int b, int c) {
		int max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		return max;
	}
	
}
