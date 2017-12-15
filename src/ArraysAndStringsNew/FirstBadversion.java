package ArraysAndStringsNew;

public class FirstBadversion {
	
	public int findbadversion(int n) {
		int i = 0; 
		int j = n; 
		while (i<j) {
			int mid = (i+(j-i))/2;
			if(isBadversion(mid)) {
				return mid;
			}else {
				i= mid+1;
			}
		}
		return -1;
	}

	private boolean isBadversion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
