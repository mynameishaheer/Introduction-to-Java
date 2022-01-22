import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first sentence");
		String s = sc.nextLine().toLowerCase();
		System.out.println("Enter second sentence");
		String t = sc.nextLine().toLowerCase();

		char[] a = s.toCharArray();
		char[] b = t.toCharArray();

		boolean found = true;

		for(int i=0; i<a.length; i++) {
			char c = a[i]; 
			if(c==' ')
				continue;
			found = false;
			for(int j=0; j<b.length; j++) {
				char d = b[j];
				if(c==d) {
					b[j] = ' ';
					found = true;
					break;
				}
			}
			if(!found) { //found == false
				break;
			}
		}

		for(int j=0; j<b.length; j++) {
			if(b[j]!=' ') {
				found = false;
			}
		}

		if(!found)
			System.out.println("Not anagrams!");
		else
			System.out.println("Anagrams!");

	}

}
