package LinkedList_theory_KK;

public class CycleQuestions {
	
	public boolean hasCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	
	//length of the cycle
	
	public int lengthCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				ListNode temp = slow;
				int length = 0;
				do { 
					temp = temp.next;
					length++;
				} while(temp != slow);
				return length;
			}
		}
		return 0;
	}

}

class ListNode {
	int val;
	ListNode next;
	
	ListNode(){
		
	}
	
	ListNode(int x){
		this.val = x;
		next = null;
		
	}
}