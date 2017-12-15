package ArraysAndStringsNew;

public class CompareVersions {
	public static void main(String[] args) {
		
	}
	
	public String  compareVersions(String s1, String s2) {
		String[] s1_array = s1.split("\\.");
		String[] s2_array = s2.split("\\.");
		int min = Math.min(s1_array.length, s2_array.length);
		for(int i=0; i<= min-1; i++) {
			if(Integer.parseInt(s1_array[i]) > Integer.parseInt(s2_array[i])) {
				return s1;
			}else if(Integer.parseInt(s2_array[i]) > Integer.parseInt(s1_array[i])) {
				return s2;
			}
		}
		if(s1_array.length > min) {
			return s1;
		}else 
			return s2;
		
	}

}
