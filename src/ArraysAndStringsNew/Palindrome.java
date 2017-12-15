package ArraysAndStringsNew;

import java.util.Stack;

/**
 * Validate given string is palindrom Red rum, sir, is murder
 * @author mouni
 *
 */

public class Palindrome {
	
	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		System.out.println(obj.validPalindrom("Red rum, sir, is murder"));
	}
	

	public boolean validPalindrom(String s) {
		int i =0; 
		int j = s.length() -1;
		while (i <=j ) {
			if(!Character.isLetterOrDigit(s.charAt(i))) {
				i++;
			}
			else if(!Character.isLetterOrDigit(s.charAt(j))) {
				j--;
			}else if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
				i++; j--;
			}else 
				return false;
		}
		return true;
			
		}
}
