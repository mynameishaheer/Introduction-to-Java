
public class DuplicatesRec {

	public static void main(String[] args) {
	
		String str = StdIn.readLine();
		StdOut.print(remove(str));
		

	}
	public static String remove(String s) {
		

		if (s.length() == 1) return s;
		
		if (s.substring(0,1).equals(s.substring(1,2))) {
			return remove(s.substring(1));
			}
		else return 
				s.substring(0,1) + remove(s.substring(1));
		
	
	}

} 