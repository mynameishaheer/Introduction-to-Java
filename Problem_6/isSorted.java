
public class isSorted {

	public static void main(String[] args) {
		
		double[] a = new double[args.length];

		for(int i=0; i< args.length; i++)
		    a[i] = Double.parseDouble(args[i]);
		
		boolean bol = true;
	
			for (int i=1; i< a.length; i++)
			{
				if (a[i]< a[i-1]) 
					
				bol = false;
			}
		System.out.println(bol);
		}		
	}
