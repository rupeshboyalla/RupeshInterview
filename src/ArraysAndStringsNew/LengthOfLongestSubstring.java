package ArraysAndStringsNew;

import java.util.HashSet;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		LengthOfLongestSubstring obj = new LengthOfLongestSubstring();
		
	}
	
	public int lengthOfLongestSubString(String s) {
		int j=0;
		HashSet<Character> set = new HashSet<>();
		for(char c : s.toCharArray()) {
			if(set.contains(c)) {
				set.remove(c);
				j++;
			}else 
				set.add(c);
		}
		return j;
	}

}
