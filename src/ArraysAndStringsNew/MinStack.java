package ArraysAndStringsNew;

import java.util.Stack;

/*
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * 
 push(x) – Push element x onto stack.
 pop() – Removes the element on top of the stack.
 top() – Get the top element.
 getMin() – Retrieve the minimum element in the stack.
 Note that all the operations have to be constant time operations.
 
 Questions to ask the interviewer :
 
 Q: What should getMin() do on empty stack ? 
 A: In this case, return -1.
 
 Q: What should pop do on empty stack ? 
 A: In this case, nothing. 
 
 Q: What should top() do on empty stack ?
 A: In this case, return -1
 NOTE : If you are using your own declared global variables, make sure to clear them out in the constructor.
 */

public class MinStack {
	
	public Stack<Integer> stack;
	public Stack<Integer> minstack;
	
	public MinStack() {
		stack = new Stack<>();
		minstack = new Stack<>();
	}
	
	public void push(int x) {
		stack.push(x);
		if(minstack.isEmpty()) {
			minstack.push(x);
			stack.push(x);
			return;
		}else if(x <= minstack.peek() ) {
			minstack.push(x);
		}
		stack.push(x);
	}
	
	public int pop() {
		int temp = stack.pop();
		if(temp <= minstack.peek()) {
			minstack.pop();
		}
		return temp;
	}
	
	public int getMin() {
		return minstack.peek();
	}
	
}
