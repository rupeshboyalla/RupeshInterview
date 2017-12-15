package Arrays;

public class FibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries obj = new FibonacciSeries();
		obj.printFibonacci(5);
		obj.fibonacciRecussion(5);
		
	}
	
	public void printFibonacci(int num) {
		int num1 =0; int num2 =1;
		System.out.print(num1+","+num2+",");
		for(int i=0; i<= num; i++) {
			int result = num1+num2;
			num1 = num2;
			num2 = result;
			System.out.print(result+",");
		}
	}
	
	public  int fibonacciRecussion(int num){
        if (num ==1 || num ==2)
            return 1;
        return fibonacciRecussion(num -1 )+ fibonacciRecussion(num-2);
    }

}
