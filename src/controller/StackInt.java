package controller;
import model.Node;

public class StackInt {
	Node stack;
	
	public boolean isEmpty() {
		if(stack == null) return true;
		
		return false;
	}
	
	public void push(int num) {
		if(isEmpty()) {
			stack = new Node(num, null);
			return;
		}
		
		stack = new Node(num, stack);
	}
	
	public int pop() throws Exception {
		if(isEmpty()) throw new Exception("there's no stack to split");
		
		int value = stack.data;
		stack = stack.next;
		
		return value;
	}

}
