package LinkedList_theory_KK;

public class DLL {
	
	Node head;
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		if(head != null) {
			head.prev = node;
		}
		node.prev = null;
		head = node;
	}                                      
	
	public void display() {
		Node node = head;
		Node last = null;
		while(node != null) {
			
			System.out.print(node.val + " -> ");
			last = node;
			node = node.next;
		}
		System.out.println("END");
		while(last != null) {
			System.out.print(last.val + " -> ");
			last = last.prev;
		}
		System.out.println("START");
	} 
	
	public void insertLast(int val) {
		Node node = new Node(val);
		Node last = head;
		if(head == null) {
			node.next = head;
			node.prev = null;
			head = node;
			return;
		}
		while(last.next != null) {
			last = last.next;
		}
		last.next = node;
		node.prev = last;
		node.next = null;
	}
	
	public Node find(int val) {
		Node node = head;
		while(node != null) {
			if(node.val == val) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	
	public void insertAfter(int after, int val) {
		Node node = new Node(val);
		Node p = find(after);
		
		if(p == null) {
			System.out.println("Node does not exist!!");
			return;
		}
		
		
		node.next = p.next;
		p.next = node;
		node.prev = p;
		if(node.next != null) {
			node.next.prev = node;
		}
		
	}
	
	private class Node{
		int val;
		Node next;
		Node prev;
		
		public Node(int val) {
			this.val = val;
		}
	}

}
