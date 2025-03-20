package LinkedList_theory_KK;

public class CLL {
	
	Node head;
	Node tail;
	
	public void insert(int val) {
		Node node = new Node(val);
		if(head == null) {
			head = node;
			tail = node;
			return;
		}
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void delete(int val) {
		Node node = head;
		if(node == null) {
			return;
		}
		
		if(node.val == val) {
			
			tail.next = head.next;
			head = head.next;
			return;
		}
		
		
		
			
			do {
				Node n = node.next;
				if(n.val == val) {
				node.next = n.next;
				break;
			}
				node = node.next;
			}while(node != head);
	
	}
	
	public void display() {
		
		Node node = head;
		if(head != null) {
			do {
				System.out.print(node.val + " -> ");
				node = node.next;
			}while(node != head);
		}
		System.out.println("HEAD");
	}
	
	private class Node{
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
		
	}

}
