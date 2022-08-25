
public class hiCounter {

	public static void main(String[] args) {
		
		StdOut.println("PLease enter string: ");
		String str = StdIn.readLine();
		StdOut.println(hiCount(str));
	}

	public static int hiCount(String s){

		
		if (s.indexOf("hi") == -1)
			return 0;
		
		int n = s.indexOf("hi");

		return 1 + hiCount(s.substring(n+1));
	}
}
