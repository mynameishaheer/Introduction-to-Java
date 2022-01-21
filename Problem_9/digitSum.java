
public class digitSum {
	public static void main (String[] args) {
		
		int x = Integer.parseInt(args[0]);
		int temp;
		int ans=0;
	
		
		if (x<0) x = -x;
		
		while (x>0) {
			temp = x % 10;
			ans = ans + temp; 
			x = x/10; 
			
		}
		
		System.out.println(ans);
		
	}
}
