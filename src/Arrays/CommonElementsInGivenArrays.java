package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the common elements in given arrays.
 * 
 * @author rupeshkb
 *
 */

public class CommonElementsInGivenArrays {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b =  {1,2,3,4,5,6,7,8,9};
		CommonElementsInGivenArrays obj = new CommonElementsInGivenArrays();
		System.out.println(Arrays.toString(obj.findCommonElements(a, b)));
		
	}
	
	public int[] findCommonElements(int[] a, int[] b) {
		int alength = a.length -1;
		int blength = b.length -1;
		Set<Integer> set = new HashSet<>();	
		ArrayList<Integer> list = new ArrayList<>();
		for(int i : a) {
			set.add(i);
		}
		
		for(int j: b) {
			if(set.contains(j) && !list.contains(j)) {
				list.add(j);
			}
		}
		
		int[] result = new int[list.size()];
		int i=0;
		
		for(int e : list) {
			result[i] = e;
			i++;
		}
		
		return result; 
	}
	
}
