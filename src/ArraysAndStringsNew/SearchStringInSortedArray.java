package ArraysAndStringsNew;

public class SearchStringInSortedArray {
	
	
	
	public boolean searchForAString(String[] a, String aa) {
		int start =0; 
		int end = a.length -1;
		while(start <= end) {
			int mid = (start+end)/2;
			if(a[mid].compareTo(aa) == 0) {
				return true;
			}else if(a[mid].compareTo(aa) > 0) {
				start = mid -1;
			}else 
				end = mid+1;
			
		}
		return false;
	}

}
