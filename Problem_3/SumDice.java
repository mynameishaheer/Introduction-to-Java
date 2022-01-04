public class SumDice
{
	public static void main(String[] args)
	{
		Double x = (Math.random());
		Double y = (Math.random());
		int a = (int) (x*7); 
		int b = (int) (y*7);  
		int c = a + b ;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}