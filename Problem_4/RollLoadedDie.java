public class RollLoadedDie
{
	public static void main(String[] args)
	{
		Double x= Math.random();
		int a=0;
		if (x < 1.0/8) a=1;
		else if(x >= 1.0/8 && x < 2.0/8) a=2;
		else if(x >= 2.0/8 && x < 3.0/8) a=3;	
		else if(x >= 3.0/8 && x < 4.0/8) a=4;	
		else if(x >= 4.0/8 && x < 5.0/8) a=5;	
		else if (x >= 5.0/8) a=6;		
		
		System.out.println(a);
	}
}