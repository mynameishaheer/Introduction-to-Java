
public class fib {

	public static void main(String[] args) {
		
		StdOut.print("Please enter term to find: ");
		int n = StdIn.readInt();
		int ans = fibb(n);
		StdOut.println("The " + n + "th term is: " + ans);
		
	}
	public static int fibb(int n) {
		 if (n==0)
			 return 0;
		 if (n==1)
			 return 1;
		 
		 int term = fibb(n-1)+ fibb(n-2);
		 
		 return term;
	}

}
  