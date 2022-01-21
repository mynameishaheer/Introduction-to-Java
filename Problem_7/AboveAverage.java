
public class AboveAverage {

	public static void main(String[] args) {
		Double sum = 0.0;
		
		Double[] a = new Double [args.length];
		for (int i=0; i <a.length; i++)
			a[i]= Double.parseDouble(args[i]);
		
		for (int i=0; i<a.length; i++)
			sum = sum + a[i];
		
		Double avg = sum/a.length;
		System.out.println("Avgerage is: " + avg);
		
		System.out.println();
		System.out.println("Values above average are: ");
		
		for (int i=0; i<a.length; i++) {
			if (a[i] > avg) System.out.println(a[i]);
		}
		
	}

}
