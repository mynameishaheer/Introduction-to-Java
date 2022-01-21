
public class Zeros {

	public static void main(String[] args) {
	
		int[] a = {0, 6, 0, 0, 5, 0, 0, 0,  0, 0, 0, 4, 3, 2, 1, 0};
		int temp;
		
		for (int j = 0; j<a.length; j++) {
			for (int i = 0 ; i < a.length-1; i++) {
				if (a[i] == 0) {	
						temp = a[i+1];
						a[i+1] = a[i];
						a[i] = temp;			
				}
			}
		}
		
		for (int i = 0; i<a.length; i++)
			System.out.print(" " + a[i]);
	}
}
