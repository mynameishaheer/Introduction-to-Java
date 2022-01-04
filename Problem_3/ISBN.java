public class ISBN
{
	public static void main (String[] args)
	{
		int x = Integer.parseInt(args[0]); 
		
		int d2 =  x % 10;
		int d3 = (x % 100) / 10;
		int d4 = (x % 1000) / 100;
		int d5 = (x % 10000) / 1000;
		int d6 = (x % 100000) / 10000;
		int d7 = (x % 1000000) / 100000;
		int d8 = (x % 10000000) / 1000000;
		int d9 = (x % 100000000) / 10000000;
		int d10 = (x % 1000000000) / 100000000;
		
		int sum = (2*d2+3*d3+4*d4+5*d5+6*d6+7*d7+8*d8+9*d9+10*d10);
		int mod = sum % 11;
		int ans = 11 - mod;
		System.out.println(mod);
	}

}



































