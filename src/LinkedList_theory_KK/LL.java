package LinkedList_theory_KK;

public class LL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public LL() {
		this.size = 0;                                                                                                                      
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size += 1;
	}
	
	public void insertLast(int val) {
		if(tail == null) {
			insertFirst(val);
			return;
		}
		Node node = new Node(val);
		tail.next = node;
		tail = node;
	}
	
	public void insert(int val, int index) {
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val,temp.next);
		temp.next = node;
	}
	
	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		return val;
	}
	
	public void deleteLast() {
		Node temp = head;
		
		while(temp.next!=null) {
			temp = temp.next;
		}
		tail = temp;
	}
	
	public void display() {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.val + "  -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next) {
			this.val = val;
			this.next = next;
		}
	}

}
