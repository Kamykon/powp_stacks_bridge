package edu.kis.vh.stacks.collections;

import edu.kis.vh.stacks.StackInterface;

public class StackArray  implements StackInterface {
	private final int size = 12;
	private final int emptyStack = -1;
	private int[] ITEMS = new int[size];

	private int total = emptyStack;


	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#push(int)
	 */
	@Override
	public void push(int i) {
		if (!isFull())
		ITEMS[++total] = i;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isEmpty()
	 */
	@Override
	public boolean isEmpty() {
		return total == emptyStack;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#isFull()
	 */
	@Override
	public boolean isFull() {
		return total == 11;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#top()
	 */
	@Override
	public int top() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total];
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.StackInterface#pop()
	 */
	@Override
	public int pop() {
		if (isEmpty())
			return emptyStack;
		return ITEMS[total--];
	}


}
