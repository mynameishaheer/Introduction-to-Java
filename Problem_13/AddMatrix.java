
public class AddMatrix {

	public static void main(String[] args) {
		
		int[][] a = { {2, 5, 7}, {1, 3, 6}, {5, 4, 1}};
		int[][] b = { {1, 9, 5},{7, 1, 5},{3, 4, 2} };
		
		int[][] c = new int [a.length][a[0].length];
		
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = 0; j<= a[0].length-1; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}	
		
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = 0; j<= a[0].length-1; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	
	}

}
