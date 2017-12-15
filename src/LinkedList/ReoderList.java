package LinkedList;
/**
 * Reorder the given list ex: 1->2->3->4
 *  O/P: 1 -> 4 -> 2 ->3
 * @author mouni
 *
 */

public class ReoderList {
	
	public Node reoderList(Node head) {
		if(head == null)
			return head;
		Node secondList = splitHalf(head);
		Node reversedList = reverse(secondList);
		Node l1 = head; 
		Node l2 = reversedList;
		while (reversedList != null) {
			
			Node temp1= l1.next;
			Node temp2 = l2.next;
			
			
		}
		
		return head;
	}
	public Node splitHalf(Node head) {
		if(head == null || head.next == null)
			return head; 
		Node fast = head; 
		Node slow = head; 
		
		while(fast.next !=null && fast.next.next !=null) {
			fast = fast.next.next; 
			slow = slow.next;
		}
		
		Node newList = slow;
		return newList;
	}
	
	
	public Node reverse(Node head) {
		if(head == null)
			return head;
		Node current = head; 
		Node prev = null; 
		Node next = null;
		while(current.next !=null) {
			next = current.next;
			current.next = prev; 
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

}
