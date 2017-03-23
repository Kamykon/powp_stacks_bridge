package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.StackList;

public class Stack {
	
	private StackInterface stackList;
	
	public Stack() {
		stackList = new StackList();
	}

	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}

	public void push(int i) {
		stackList.push(i);
	}

	public boolean isEmpty() {
		return stackList.isEmpty();
	}

	public boolean isFull() {
		return stackList.isFull();
	}

	public int top() {
		return stackList.top();
	}

	public int pop() {
		return stackList.pop();
	}
	
	//Now it's possible to use StackArray and Stacklist

}
