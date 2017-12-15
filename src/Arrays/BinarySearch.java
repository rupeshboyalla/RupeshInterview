package Arrays;

/*
 * Binary search is applicable only for the sorted array 
 * Time complexity for binary search is log N
 */

public class BinarySearch {

	public static void main(String[] args) {
		BinarySearch obj = new BinarySearch();
		int[] a = {1,2,3,3,4,5,6,7,8,9};
		System.out.println(obj.search(a, 5));
	}

	public boolean search(int[] a, int value) {
		int start = 0, end = a.length - 1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] == value) {
				return true;
			} else if (a[mid] > value) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return false;
	}

}
