package ArraysAndStringsNew;

/**
 * Rotate Given array 
 * @author mouni
 * 
 * Example:
 * 
 * [1,2,3,4,5,6,7] and to rotate K times ex =2 o/p
 * [6,7,1,2,3,4,5,6]
 *
 */

public class RotateArray {
	
	public static void main(String[] args) {
		
	}
	
	//Using bubble sort time complexity is O(n*k)
	
	public static void rotateArrayUsingBubbleSort(int[] a, int order) {
		if (a.length ==0 || order <0) {
			throw new IllegalArgumentException("check input array or order value");
		}
		for(int i=0; i< order; i++) {
			for(int j = a.length-1; j > 0; j--) {
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
		
	}
	
	/**
	 *  For the best time complexity O(n) diving the array into two parts and reverse each part and finally 
	 *  reverse whole array
	 */
	public static void rotateArray(int[] a, int order) {
		if(a.length ==0 || order <0) {
			throw new IllegalArgumentException("Check the input data");
		}
		int rotateOrder = 0;
		if(order > a.length) {
			rotateOrder = order%a.length;
		}else 
			rotateOrder = order;
		reverse(a, 0, rotateOrder-1);
		reverse(a, rotateOrder, a.length-1);
		reverse(a, 0, a.length-1);		
	}
	
	public static void reverse(int[] a, int start, int end) {
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start ++;
			end --;
		}
	}
	
	 

}
