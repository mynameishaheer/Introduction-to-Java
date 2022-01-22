public class BoysAndGirls
{
	public static void main(String[] args)
	{
		int b=0;
		int g=0;
		while (b==0 || g==0)
		{
			Double a = Math.random();
			if (a<0.5) b++;
			else g++;
		}
		System.out.println("Number of Boys: " + b);
		System.out.println("Number of Girls: " + g);
	}
}


