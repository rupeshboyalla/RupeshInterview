package ArraysAndStringsNew;

/**
 * peak index - in a given array finding max of element and returning index.
 * @author mouni
 *
 */

public class FindPeakIndex {
	
	
	public int findPeakIndex(int[] a) {
		if(a.length ==0 )
			return -1;
		int max = a[0];
		int index =0;
		
		for(int i=1; i< a.length-2; i++) {
			int prev= a[i-1];
			int next = a[i+1];
			int curr = a[i];
			if(curr > prev && curr >next && curr > max) {
				index =i;
				max = curr;
			}
		}
		if(a[a.length-1] > max) {
			return a.length-1;
		}else 
		return index;
	}
	
	

}
