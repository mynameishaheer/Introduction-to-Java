
public class isValidFunc {

	public static void main(String[] args) {
		
		String password ="";
		StdOut.print("Enter Password: ");
		password = StdIn.readLine();
		boolean flag = isValid(password);
		StdOut.println(flag);
		
	}
	public static boolean isValid(String pass) {

		if (pass.length() < 10 ) {
			return false;
		}
		
		int digCount = 0;
		
		for (int i =0; i< pass.length();i++){
			char c= pass.charAt(i);
			int as = c;
			if (!((as>=48 && as<=57) || (as>=65 && as<=90) || (as>=97 && as<=122))) {
			return false;
			}
		}
		
		for (int i =0; i< pass.length();i++) {
			if (Character.isDigit(pass.charAt(i))) {
				digCount++;
			}
		}
		
		if(digCount<2) {
			return false;
		}
		
		return true;
	}
}
