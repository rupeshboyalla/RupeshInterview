package ArraysAndStringsNew;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFromStream {
	public static PriorityQueue<Integer> leftHalf;
	public static PriorityQueue<Integer> rightHalf;
	
	MedianFromStream(){
		leftHalf = new PriorityQueue<Integer>(Collections.reverseOrder());
		rightHalf = new PriorityQueue<Integer>();
	}
	
	
	public static void main(String[] args) {
		MedianFromStream obj = new MedianFromStream();
		int[] a = {10, 7,1,5,4,3,6,13};
		for(int i=0; i<=a.length-1; i++) {
			obj.addNumber(a[i]);
		}
		System.out.println(obj.getMedian());
		
	}
	
	public void addNumber(int n) {
		leftHalf.add(n);
		rightHalf.add(leftHalf.remove());
		if(leftHalf.size() < rightHalf.size()) {
			leftHalf.add(rightHalf.remove());
		}
	}
	
	public double getMedian()
	{
		if(leftHalf.size() == rightHalf.size()) {
			return (double) (leftHalf.peek() + rightHalf.peek())/2;
		}else 
			return (double) leftHalf.peek();
	}
}
