public class Stats3
{
	public static void main (String[] args)
	{
		double x = Math.random();
		double y = Math.random();
		double z = Math.random();
		System.out.println(x + " " + y +" "+ z);
		
		double avg = (x+y+z)/3;
		System.out.println("The average is: "+ avg);

		double min = Math.min(x,y);		
		min = Math.min(min,z);
		System.out.println("The min value is: "+ min);

		double max = Math.max(x,y);
		max = Math.max(max,z);
		System.out.println("The max value is: "+ max);

		
	}	
}