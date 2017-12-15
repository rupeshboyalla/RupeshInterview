package Arrays;

import java.util.Arrays;
/**
 * Find the numbers in pairs in a given array
 * @author Rupesh
 *
 */

public class FindNumbersInPairs {
	
	public static void main(String[] args) {
		int[] a = {1,1,2,3,4,4,4,5,5,5,6,6,7,7,7,7};
		FindNumbersInPairs obj = new FindNumbersInPairs();
		obj.findNumbersInPairs(a, 5);
	}
	
	public void findNumbersInPairs(int[] a, int value) {
		Arrays.sort(a);
		int i = 0, j=a.length-1;
		while(i < j) {
			if(a[i]+a[j] == value) {
				System.out.println(a[i]+" "+a[j]);
				i++;
				j--;
			}else if(a[i]+a[j] > value) {
				j--;
			}else 
				i++;
		}
	}

}
