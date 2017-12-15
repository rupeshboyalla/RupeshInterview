package Arrays;

public class CountOccuranceOfAnElement {
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,4,4,7,8,9};
		CountOccuranceOfAnElement obj = new CountOccuranceOfAnElement();
		int first = obj.countOccurance(a, 4, true);
		int second = obj.countOccurance(a, 4, false);
		
		System.out.println((second-first)+1);
		
	}
	
	public int countOccurance(int[] a, int value, boolean isFirstOccurance) {
		int start = 0, end = a.length-1;
		int result =0;
		while (start <= end) {
			int mid = (start+end)/2;
			if(a[mid] == value) {
				result = mid;
				if(isFirstOccurance) {
					end = mid -1;
				}else 
					start = mid+1;
			}else if(a[mid] > value)
				end = mid -1;
			else 
				start = mid+1;
		}
		return result;
	}
	

}
