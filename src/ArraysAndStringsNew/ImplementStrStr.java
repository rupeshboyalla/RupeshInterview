package ArraysAndStringsNew;

/**
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1

 * 
 *
 */
public class ImplementStrStr {
	public static void main(String[] args) {
		ImplementStrStr obj = new ImplementStrStr();
		System.out.println(obj.search("hello", "ll"));
	}
	
	public int search (String haystack, String needle) {
		if(haystack == null || needle == null)
			return -1;
		int j = 0;
		char[] haystack_array = haystack.toCharArray();
		char[] needle_array = needle.toCharArray();
		for(int i=0; i< haystack.length(); i++) {
			if(haystack_array[i] == needle_array[j]) {
				if(needle.length() -1 == j) {
					return j+1;
				}else 
					j++;
			}
		}
		return j == 0 ?-1: j+1;
	}

	
}
