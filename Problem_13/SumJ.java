
public class SumJ {

	public static void main(String[] args) {
		int[][] a = { 
				{2, 5, 7}, 
				{1, 3, 6}, 
				{5, 4, 1}};
		int j=0;
		int x = 0; 
		
		for (int i = 0; i <= a[0].length-1; i++) {
			x = x + a[i][j];
			}
		
			System.out.println(x);
	}
}

