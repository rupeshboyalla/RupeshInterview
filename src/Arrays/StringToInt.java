package Arrays;

public class StringToInt {
	public static void main(String[] args) {
		StringToInt obj = new StringToInt();
		System.out.println(obj.stringToInt("123"));
		System.out.println(obj.stringToInt("-123"));
	}
	
	public int stringToInt(String s) {
		if(s == null || s == " ")
			return -1;
		int index = 0;
		int result =0;
		boolean isNegative = false;
		if(s.charAt(index) == '-') {
			isNegative = true;
			index ++;
		}
		for(;index<=s.length()-1; index++) {
			if(Character.isDigit(s.charAt(index))) {
				result = result*10 + Character.getNumericValue(s.charAt(index));
			}
		}
		if(isNegative) {
			result = 0-result;
		}
		
		return result;
	}

}
