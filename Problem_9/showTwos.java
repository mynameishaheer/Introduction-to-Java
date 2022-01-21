
public class showTwos {
	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		String ans = "" + x + " = ";
		
		while (x % 2 ==0)
		{
			x= x/2;
			ans = ans + "2 * "; 
		}
		ans = ans + "" + x;
		System.out.println(ans);
	}
}
