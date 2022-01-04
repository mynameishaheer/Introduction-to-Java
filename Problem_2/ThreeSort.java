public class ThreeSort
{
	public static void main(String[] args)
	{
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);
		double z = Double.parseDouble(args[2]);
		
		double min = Math.min(x,y);
		min = Math.min(min, z);

		double max = Math.max(x,y);
		max = Math.max(max, z);	

		double mid = (x+y+z)-(min+max);	

		System.out.println("Asc Order: " +" "+ min +" "+ mid +" "+ max);
	}
}