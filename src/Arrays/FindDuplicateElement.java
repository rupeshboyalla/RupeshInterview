package Arrays;

import java.util.HashSet;
import java.util.Set;


public class FindDuplicateElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9,5,4};
		FindDuplicateElement obj = new FindDuplicateElement();
		obj.findDuplicateEle(a);
		
	}
	
	public void findDuplicateEle(int[] a) {
		Set<Integer> set = new HashSet<>();
		for(int i : a) {
			if(set.contains(i)) {
				System.out.println(i);
			}else
				set.add(i);
		}
	}

}
