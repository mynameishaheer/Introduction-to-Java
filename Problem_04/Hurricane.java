public class Hurricane
{
	public static void main(String[] args)
	{
		int a=Integer.parseInt(args[0]);
		String cat="";
			
		if (a<74) cat = "Not a Hurricane";
		else if (a<=95) cat="Category 1";
		else if (a<=110) cat="Category 2";
		else if (a<=130) cat="Category 3";
		else if (a<=155) cat="Category 4";
		else if (a>=156) cat="Category 5";			
		
		System.out.println(cat);
		
	}
}
