package ArraysAndStringsNew;

public class ReverseStringWithSpaces {

	public static void main(String[] args) {
		
	}
	
	public String isPalindrome(String s) {
		if(s == null || s.length() ==0 ) {
			return s;
		}
		String[] s_array = s.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i = s_array.length; i <=0; i++) {
			sb.append(s_array[i]);
			sb.append(" ");
		}
		
		return sb.toString();
	}
}
