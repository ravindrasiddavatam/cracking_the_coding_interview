package LinkedList;

  class ListNode {
  int val;
  ListNode next;
  ListNode(int x) {
  val = x;
  next = null;
  }
  }
  
//Time Complexity : O(n) Space Complexity : O(1)
public class Linked_List_Cycle_Optimized {
	
	 public boolean hasCycle(ListNode head) {

	        ListNode slow = head;
	        ListNode fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;

	            if (slow == fast) {
	                return true;
	            }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
