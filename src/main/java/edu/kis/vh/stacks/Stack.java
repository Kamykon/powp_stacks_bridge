package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.StackList;

public class Stack {

	private StackInterface stackList;

	public Stack() {
		stackList = new StackList();
	}

	public Stack(StackInteraface stackList) {
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


//Dzieki zmiana mozna naprzemiennie uzywac StackArray i StackList
//F3 przenosi do deklaracji metody
//Ctrl + T pokazuje hierarchie deklaracji metod oraz w jakich impementacjach interfejsu znajdziemy metode
//Ctrl + kursor to samo co F3