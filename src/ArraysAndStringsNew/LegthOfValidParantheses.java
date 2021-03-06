package ArraysAndStringsNew;

import java.util.Stack;

public class LegthOfValidParantheses {
	
	public static void main(String[] args) {
		LegthOfValidParantheses obj = new LegthOfValidParantheses();
		System.out.println(obj.lengthOfValidPara("([{}]"));
	}
	
	public int lengthOfValidPara(String s) {
		if(s.length() ==0)
			return -1;
		int result =0;
		char L_PARA = '(';
		char R_PARA = ')';
		char L_BRACES = '[';
		char R_BRACES = ']';
		char L_CBRACES = '{';
		char R_CBRACES = '}';
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == L_PARA || temp == L_BRACES || temp == L_CBRACES) {
				stack.push(temp);
			} else if (temp == R_PARA && !stack.isEmpty() && stack.pop() == L_PARA) {
				result = result+2;
			} else if (temp == R_BRACES && !stack.isEmpty() && stack.pop() == L_BRACES) {
				result = result+2;
			} else if (temp == R_CBRACES && !stack.isEmpty() && stack.pop() == L_CBRACES) {
				result = result+2;
			}
		}
		return result;
	}

}
