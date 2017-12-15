package MinStack;

import java.util.Stack;

import Arrays.MissingNumber;

public class MinStack {
	
	public Stack<Integer> stack;
	public Stack<Integer> minStack;
	
	public MinStack() {
		stack = new Stack<>();
		minStack = new Stack<>();
	}
	
	public void push(int x) {
		if(minStack.isEmpty() || minStack.peek() <= x) {
			minStack.push(x);
			stack.push(x);
			return;
		}else if(stack.peek() < minStack.peek()) {
			minStack.push(x);
			stack.push(x);
			return;
		}
		stack.push(x);
	}
	
	public int pop() {
		int temp;
		if(stack.peek() >= minStack.peek()) {
			minStack.pop();
			temp = stack.pop();
		}else 
			temp = stack.pop();	
		return temp;
	}
	
	
	public int getMin() {
		return minStack.peek();
	}
}
