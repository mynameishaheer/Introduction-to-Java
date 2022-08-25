
public class RLFunc {

	public static void main(String[] args) {

		int[] array = {3,8,19,7};
		array = rotateLeft(array);
		for(int i=0; i<array.length; i++) {
			StdOut.print(array[i] + " ");
		}
		
	}

	public static int[] rotateLeft(int[] a) {
		int temp = a[0];
		
		for (int i = 1; i<a.length; i++) {
			a[i-1] = a[i];
		}
		
		a[a.length-1] = temp;
		return a;
	}
	
}
