
public class RecursiveAddition {

	public static void main(String[] args) {
		int[] array= {2,4,6,8,10,12, 30};
		int s= sum(array,array.length-1);	
		StdOut.print(s);
		
	}
	
	// this function find the sum of first n elements of array

	public static int sum(int[] a, int n) {

		if(n==0) return a[0]; // base case

	int s = a[n] ; // recursively find the sum of n-1 elements 

	return s + sum(a, n-1); // return s + the last element

	}
}
