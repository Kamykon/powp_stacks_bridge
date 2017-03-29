package edu.kis.vh.stacks;

import edu.kis.vh.stacks.collections.StackList;
import edu.kis.vh.stacks.collections.StackInterface;

public class StackFIFO extends Stack {

	private StackList temp = new StackList();//brak ograniczen co do ilosci elementow

	public StackFIFO() {
 		super();
 		// TODO Auto-generated constructor stub
 	}

 	public StackFIFO(StackInteraface stackList) {
 		super(stackList);
 		// TODO Auto-generated constructor stub
 	}

	@Override
	public int pop() {
		while (!isEmpty())

		temp.push(super.pop());

		int ret = temp.pop();

		while (!temp.isEmpty())

		push(temp.pop());

		return ret;
	}
}
