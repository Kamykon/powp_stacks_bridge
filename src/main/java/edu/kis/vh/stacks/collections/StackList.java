package edu.kis.vh.stacks.collections;

import edu.kis.vh.stacks.StackInterface;

public class StackList  implements StackInterface {

	private Node last;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	public boolean isEmpty() {
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return emptyStack;
		return last.getValue();
	}

	public int pop() {
		if (isEmpty())
			return emptyStack;
		int ret = last.getValue();
		last = last.getPrev();
		return ret;
	}
	
	//Refactor methodes names and delegation

}

class Node {

	private int value;
	private Node prev;
	private Node next;

	Node(int i) {
		setValue(i);
	}

	public int getValue() {
 		return value;
 	}

 	public void setValue(int value) {
 		this.value = value;
 	}

 	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
  	}

}