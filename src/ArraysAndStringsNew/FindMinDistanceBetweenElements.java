package ArraysAndStringsNew;

public class FindMinDistanceBetweenElements {
	public static void main(String[] args) {
		
	}
	
	public int minDistance(int[] array, int e1, int e2) {
		if(array.length ==0)
			return -1;
		int a = -1, b=-1;
		for(int i=0; i<=array.length; i++) {
			if(array[i] == e1) {
				a =i;
			}
			if(array[i] == e2) {
				b =i;
			}
		}
		
		if(a !=-1 && b != -1) {
			return Math.abs(a-b)+1;
		}else 
			return -1;
	}

}
