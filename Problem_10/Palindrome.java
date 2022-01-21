
public class Palindrome {

	public static void main(String[] args) {
		String x = args[0];
		int a = x.length()/2;
		boolean t = true;

		for (int i = 0; i < a; i++) {
				if (x.charAt(i) != x.charAt(x.length()-1-i)) {
				t = false;
				break;
				}
			else t = true;	
		}
		
		System.out.println(t);
	
	}
}
