package ArraysAndStringsNew;

public class InsertPosition {
	
	public static void main(String[] args) {
		int[] a = {1,3,5,6};
		InsertPosition obj = new InsertPosition();
		System.out.println(obj.insertPosition(a, 2));
		
		
	}
	
	public int insertPosition(int[] a, int value) {
		int start =0; 
		int end = a.length -1;
		while (start <= end) {
			int mid = (start+end)/2;
			if(value > a[mid]) {
				start = mid+1;
			}else if(value < a[mid]) {
				end = mid-1;
			}else 
				return mid;
		}
		return start;
	}
}
