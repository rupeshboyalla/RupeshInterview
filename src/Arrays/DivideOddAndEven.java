package Arrays;

import java.util.Arrays;

/**
 * Rearrange an array with odd and even numbers 
 * @author Rupesh
 *
 */

public class DivideOddAndEven {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		DivideOddAndEven obj = new DivideOddAndEven();
		System.out.println(Arrays.toString(obj.rearrangeOddAndEven(a)));
		
	}
	
	public int[] rearrangeOddAndEven(int[] a) {
		int i=0, j=a.length -1;
		
		while (i <= j) {
			while(a[i]%2 ==0 ) {
				i++;
			}
			
			while (a[j]%2 !=0) {
				j --;
			}
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		
		return a;
	}

}
