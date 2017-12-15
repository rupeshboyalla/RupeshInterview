package Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,7,8};
		MissingNumber obj = new MissingNumber();
		System.out.println(obj.missingNumber(a));
	}
	
	public int missingNumber(int[] a) {
		if(a.length ==0)
			return -1;
		int start = 0, end = a.length -1;
		
		while (start <= end) {
			int mid = (start+end)/2;
			if(a[mid] - a[mid-1] > 1) {
				return a[mid] -1;
			}else if(a[mid] > mid+1)
				end = mid -1;
			else 
				start = mid+1;
		}
		return -1;
	}

}
