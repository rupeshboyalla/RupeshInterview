package ArraysAndStringsNew;

import java.util.Stack;

public class ValidParantheses {
	public static void main(String[] args) {
		ValidParantheses obj = new ValidParantheses();
		System.out.println(obj.validParantheses("([{}])"));
	}

	public boolean validParantheses(String s) {
		if (s.length() == 0)
			return false;
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
			} else if (temp == R_PARA && !stack.isEmpty() && stack.pop() != L_PARA) {
				return false;
			} else if (temp == R_BRACES && !stack.isEmpty() && stack.pop() != L_BRACES) {
				return false;
			} else if (temp == R_CBRACES && !stack.isEmpty() && stack.pop() != L_CBRACES) {
				return false;
			}
		}
		return stack.isEmpty();
	}

}
