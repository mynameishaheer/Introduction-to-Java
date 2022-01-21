
public class NotAlone {
	
	public static void main (String[] args) {
		int x = 0;
			
		int[] a = new int [args.length];
		for (int i=0; i <a.length; i++)
			a[i]= Integer.parseInt(args[i]);
		
		for (int i = 1; i < (a.length-1); i++) 
		{
			if (a[i-1]!= a[i] && a[i+1]!= a[i]) 
			{
				x = Math.max(a[i-1],a[i+1]);
				a[i] = x;
			}	
		}
		
		System.out.println("The new array is: ");
		System.out.println();
		
		for (int i = 0; i < (a.length); i++)
			System.out.print(a[i] + " ");
		
	}
}
