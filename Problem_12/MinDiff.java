public class MinDiff {
	public static void main(String[] args) {
			
		int[] a = { 50, 1, 7, 25, 9};
		int n = a.length;
		int value = Integer.MAX_VALUE;
		int num1 = 0;
		int num2 = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int result = Math.abs(a[i] - a[j]);
				if (result < value) {
					value = result;
					num1 = a[i];
					num2 = a[j];
				}
			}
		}
		
		System.out.println(num1 + "-" + num2 + " = " + value);
		
		
	}
}