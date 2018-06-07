
public class DoubleLinkedList<E> {
	
	private class Node{
		E info;
		Node next;
	    Node prev;
		
		public Node(E info,Node next,Node prev){
			this.info = info;
			this.next = next;
			this.prev = prev;
		}
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public DoubleLinkedList(){
		size = 0;
	}
	
	public void addToFirst(E info)
	{
		Node tmp = new Node(info, head, null);
		
		if(head != null)
			head.prev = tmp;
		head = tmp;
		if(tail == null)
			tail = tmp;
		size++;
	}
	
	public void addToLast(E info)
	{
		Node tmp = new Node(info, null, tail);
		
		if(tail != null)
			tail.next = tmp;
		tail = tmp;
		
		if(head == null)
			head = tmp;
		size++;
	}
	
	public E deleteFirst(){
		Node tmp = head;
		head = head.next;
		head.prev = null;
		size--;
		return tmp.info;
	}
	
	public E deleteLast(){
		Node tmp = tail;
		tail = tail.prev;
		tail.next = null;
		size--;
		return tmp.info;
	}
	
	public int getSize()
	{
		return this.size;
	}
	
	public void printList()
	{
		Node tmp = head;
		for(int i = 0; i< size; i++)
		{
			System.out.print(tmp.info + ",");
			tmp = tmp.next;
		}
		System.out.println();
	}
	
}
