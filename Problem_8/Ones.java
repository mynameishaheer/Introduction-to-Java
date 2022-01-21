
public class Ones {

	public static void main(String[] args) {
		
		/*int[] a = new int [args.length];
		for (int i=0; i <a.length; i++)
			a[i]= Integer.parseInt(args[i]);*/
		
		int [] a = {1, 1, 1, 1, 1, 1, 0, 1, 1, 1,1,1 ,1 ,1};
		int max = 0;
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i]==1) {
				temp = temp + 1;
				if (temp>max) max = temp;
			}
			else temp = 0;
			
		}
		System.out.println(max);
		

	}

}
