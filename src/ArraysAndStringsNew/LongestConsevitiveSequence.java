package ArraysAndStringsNew;

import java.util.HashSet;

public class LongestConsevitiveSequence {
	public static void main(String[] args) {
		
	}
	
	public int longestConSeq(int[] a) {
		HashSet<Integer> set = new HashSet<>();
		int count=0;
		if(a.length ==0)
			return -1;
		for(int e: a) {
			set.add(e);
		}
		
		for(int e:a) {
			int left = e-1;
			int right = e+1;
			if(set.contains(left)) {
				set.remove(left);
				count ++;
			}
			if(set.contains(right)) {
				set.remove(right);
				count++;
			}
		}
	
		return count;
	}

}
