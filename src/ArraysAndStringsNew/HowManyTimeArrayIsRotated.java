package ArraysAndStringsNew;

public class HowManyTimeArrayIsRotated {

	// Using binary search algo
	public int howManyTimeRotated(int[] a) {
		if (a.length == 0) {
			return -1;
		}
		int start = 0, end = a.length - 1;
		while (start <= end) {
			if (a[start] <= a[end]) {
				return start;
			}
			int mid = (start + end) / 2;
			int next = (mid + 1) % a.length;
			int prev = mid - 1;
			if (a[mid] < a[next] && a[mid] < a[prev]) {
				return mid;
			} else if (a[mid] <= a[end]) {
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return -1;
	}

	// Using iterative method
	public int howManyTimeRotatedUsingLinerSearch(int[] a) {
		int min = a[0];
		int minIndex = 0;
		for (int i = 1; i <= a.length - 1; i++) {
			if (a[i] < min) {
				min = a[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
