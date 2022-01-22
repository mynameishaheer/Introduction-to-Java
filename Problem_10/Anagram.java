
public class Anagram {

	public static void main(String[] args) {
		String s = "D e s p e r a t i o n";
		String t = "A rope ends it";
		//System.out.println(s.substring(2,5)+"|");

		s = s.toLowerCase();
		t = t.toLowerCase();
		
		s = s.replace(" ", "");
		t = t.replace(" ", "");
		
		boolean isAnagram = true;
		for(int i=0; i<s.length(); i++) {
			String c = s.charAt(i) + "";
			//String c = Character.toString( s.charAt(i) );
			//String c = s.substring(i,i+1);
			if(t.contains(c))
				t = t.replaceFirst(c, "");
			else {
				isAnagram = false;
				break;
			}
		}
		
		//System.out.println("s: " + s);
		//System.out.println("t: " + t);
		
		if(t.length()>0)
			isAnagram = false;
		
		if(isAnagram)
			System.out.println("Anagrams!");
		else
			System.out.println("Not anagrams!");
			

	}

}
