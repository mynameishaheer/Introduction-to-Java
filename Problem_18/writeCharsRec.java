
public class writeCharsRec {

	public static void main(String[] args) {
		int num = StdIn.readInt();
		writeChars(num);
	}
	public static void writeChars(int n) {
		
		if(n == 2) {
			StdOut.print ("**");
		return;
		}
		if(n == 1) {
			StdOut.print ("*");
		return;
		}
		
		StdOut.print("<");
		writeChars(n-2);
		StdOut.print(">");
		
		
	}
}
