package Arrays;

public class IntToString {
	public static void main(String[] args) {
		IntToString obj = new IntToString();
		System.out.println(obj.intToString(123));
		
	}
	
	public String intToString(int num) {
		StringBuffer sb = new StringBuffer();
		if(num < 0) {
			num = Math.abs(num);
		}
		if(num == 0) {
			return null;
		}
		while (num > 0) {
			int temp = num%10;
			num = num/10;
			sb.append(temp);
		}
		return sb.reverse().toString();
	}

}
