package ArraysAndStringsNew;

import java.util.Arrays;

/**
 * Majority of element is element that appears more than n/2 times.
 * 
 * @author mouni
 *
 */


public class MajortyOfElement {
	public static void main(String[] args) {
		int[] a = {1,2,3,1};
		MajortyOfElement obj = new MajortyOfElement();
		System.out.println(obj.findMajorityOfElement(a));
	}
	
	
	public int findMajorityOfElement(int[] a) {
		if(a.length ==0) {
			return -1;
		}
		Arrays.sort(a);
		return a[a.length/2 -1];
	}

}
