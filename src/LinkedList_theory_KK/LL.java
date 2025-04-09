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
	
	public int delete(int index){
		Node prev = get(index - 1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		return val;
		
	}
	
	public Node find(int value) {
		Node node = head;
		while(node != null) {
			if(node.val  == value) {
				return node;
			}
			node = node.next;
		}
		return null;
	}
	public void display() {
		Node temp = head;
		
		while(temp!=null) {
			System.out.print(temp.val + "  -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	//merge two sorted LinkedLists
	
	public static LL merge(LL first, LL second) {
		Node f = first.head;
		Node s = second.head;
		
		LL ans = new LL();
		
		while(f != null && s != null) {
			if (f.val < s.val) {
				ans.insertLast(f.val);
				f = f.next;
			} else {
				ans.insertLast(s.val);
				s = s.next;
			}
		}
		
		while( f != null) {
			ans.insertLast(f.val);
			f = f.next;
		}
		
		while (s != null) {
			ans.insertLast(s.val);
			s = s.next;
		}
		
		return ans;
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
		
		   @Override
		    public String toString() {
		        return "Node{" + "val=" + val + '}';
		    }
	}

}
