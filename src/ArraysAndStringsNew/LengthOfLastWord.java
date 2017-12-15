package ArraysAndStringsNew;

public class LengthOfLastWord {
	
	public static void main(String[] args) {
		
	}
	
	public int lengthOfLastWord(String s) {
		if(s == null || s.length()==0)
			return -1;
		int count =0;
		for(int i= s.length()-1; i >= 0 ; i++) {
			if(Character.isLetterOrDigit(s.charAt(i))) {
				count ++;
			}else 
				return count;
		}
		return count;
	}
	
	

}
