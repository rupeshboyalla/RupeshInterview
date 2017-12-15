package Arrays;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

import javax.sound.midi.Soundbank;

public class GetMedianFromStream {
	
	public static void main(String[] args) {
		int[] a = {1,5,6,7,8,10,9,9};
		GetMedianFromStream obj = new GetMedianFromStream();
		for(int e: a) {
			obj.add(e);
			System.out.println(obj.getMedian());
		}
	}
	
	public static PriorityQueue<Integer> lefthalf;
	public static PriorityQueue<Integer> righthalf;
	
	public GetMedianFromStream() {
		lefthalf = new PriorityQueue<>(Collections.reverseOrder());
		righthalf = new PriorityQueue<>();
	}
	
	public void add(int a) {
		lefthalf.add(a);
		righthalf.add(lefthalf.remove());
		if(lefthalf.size() < righthalf.size()) {
			lefthalf.add(righthalf.remove());
		}
	}
	
	public double getMedian() {
		if(lefthalf.size() == righthalf.size()) {
			return (double) (lefthalf.peek()+righthalf.peek())/2;
		}else 
			return (double) lefthalf.peek();
	}

}
