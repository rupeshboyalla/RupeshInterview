package ArraysAndStringsNew;

import java.util.Map;
import java.util.TreeMap;

/**
 * Remove Duplicates at most allowed is twice.
 * EX: given array [1,1,1,2,2,3,3] if answer is 6 then, 1,1,2,2,3
 * 
 * @author mouni
 *
 */
public class RemoveDuplicates {
	
	public int[] removeDuplicatesAtMostTwice(int[] a, int value) {
		if(a.length == 0 )
			throw new IllegalArgumentException("Given input array is empty");
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int e: a) {
			if(map.containsKey(e)) {
				int value1 = map.get(e);
				if(value <= 2) {
					map.put(e, map.get(e)+1);
				}
			}else 
				map.put(e, 1);
		}
		int[] result = new int[value];
		for(Map.Entry<Integer, Integer> entrymap : map.entrySet()) {
			int temp = entrymap.getValue();
			
		}
		return result;
	}
	

}
