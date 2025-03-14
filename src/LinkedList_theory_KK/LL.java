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
		size += 1;
	}
	
	public void insert(int val, int index) {
		Node temp = head;
		for(int i=1;i<index;i++) {
			temp = temp.next;
		}
		
		Node node = new Node(val,temp.next);
		temp.next = node;
		size += 1;
		
	}
	
	public int deleteFirst() {
		int val = head.val;
		head = head.next;
		
		if(head == null) {
			tail = null;
		}
		size--;
		return val;
	}
	
	public int deleteLast() {
		int val = tail.val;
		
		Node secondLast = get(size-2);
		tail = secondLast;
		tail.next = null;
		size--;
		return val;
	}
	
	public Node get(int index){
		Node node = head;
		for(int i=0;i<index;i++) {
			node = node.next;
		}
		return node;
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
