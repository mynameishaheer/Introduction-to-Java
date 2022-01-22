
public class RemoveLetters {

	public static void main(String[] args) {
		
		String word = "ABBCCCCCBBAB";
		String newWord = word.charAt(0) + ""; 
		
		for (int i = 0; i< word.length()-1; i++) {
			
			char c = word.charAt(i);
			char d = word.charAt(i+1);
			
			if(c != d ) { 
				newWord = newWord + d ;
			}
		}
		
		System.out.println(newWord);
	}

}
