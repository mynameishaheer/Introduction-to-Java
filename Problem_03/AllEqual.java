public class AllEqual 
{
	public static void main (String[] args)
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		
		Boolean a = (x==z) && (x==y);
		System.out.println(a);
	}
}
