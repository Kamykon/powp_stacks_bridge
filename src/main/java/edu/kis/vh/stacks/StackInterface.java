package edu.kis.vh.stacks;

public interface StackInterface {

	int emptyStack = -1;

	/**
	 * Ta metoda dodaje nowe elementy do stosu
	 * @param i to element ktory bedzie dodany
	 */
	void push(int i);

	/**
	 * Ta metoda sprawdza czy stos jest pusty
	 * @return zwraca prawde jesli stos jest pusty
	 */
	boolean isEmpty();

	/**
	 * Ta metoda sprawdza czy stos jest pelen
	 * @return zwraca prawde jezeli stos jest pelen
	 */
	boolean isFull();

	/**
	 * Ta metoda zwraca wartosc z gory stosu
	 */
	int top();

	/**
	 * Ta metoda zwraca wartosc z gory stosu oraz ja usuwa
	 */
	int pop();

}