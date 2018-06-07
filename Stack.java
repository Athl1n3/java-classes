//A stack implementation using inheritance method
public class Stack<E> extends DoubleLinkedList<E>{
	
	public void push(E info) {
		addToFirst(info);
	}
	
	public E pop() {
		return deleteFirst();
	}

}
