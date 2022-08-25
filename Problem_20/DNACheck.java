
public class DNACheck {

	public static void main(String[] args) {
		String DNA = "ATAGATGCATAGCGCATAGCTAGATGTGCTGAC";
		System.out.print(check(DNA));
	}
	public static String check(String s) {
		int start_index= 0;		
		String temp = "";
	
		
		if (s.contains("ATG")) 
			start_index = s.indexOf("ATG");
		else return " ";	
		
		
		
		for (int i =start_index+3; i< s.length(); i=i+3) {
			temp = s.substring(i, i+3);
			if(temp.contains("TAG") || temp.contains("TAA") || temp.contains("TGA")) {
				return s.substring(start_index, i+3) + " " + check(s.substring(i+3));
				//gene = s.substring(start_index, end_index+3);
			}
		}

		return " ";
		
	}
	
}
