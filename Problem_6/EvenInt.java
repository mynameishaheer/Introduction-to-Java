
public class EvenInt {

	public static void main(String[] args) {
		
		int[] a = new int[args.length];

		for(int i=0; i< args.length; i++)

		    a[i] = Integer.parseInt( args[i] );
		
		for (int i = 0; i<a.length ; i++) 
			if (a[i] % 2 == 0) System.out.println(a[i]);
	}

}
