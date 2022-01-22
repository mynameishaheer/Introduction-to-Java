public class Harmonic
{
	public static void main(String[] args)
	{
		Double n = Double.parseDouble(args[0]);
		Double a = 0.0;
		int i = 0;	
		while (i < n)
		{
			i = i + 1;
			a= a+(1.0/i);

		}
		System.out.println(a);
	}
}
