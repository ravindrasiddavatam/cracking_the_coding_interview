package LinkedList;

public class Reverse_Linked_List_Optimized {
	
	  public ListNode reverseList(ListNode head) {
	        ListNode prev = null;
	        while (head != null) {
	            ListNode temp = head.next;
	            head.next = prev;
	            prev = head;
	            head = temp;
	        }
	        return prev;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
