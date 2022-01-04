public class Distance
{
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1])

		double dist = Math.sqrt((x*x)+(y*y));
		System.out.println("Distance from origin is: " + dist);
		
	}
}