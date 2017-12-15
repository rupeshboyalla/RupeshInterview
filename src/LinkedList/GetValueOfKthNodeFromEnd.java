package LinkedList;

public class GetValueOfKthNodeFromEnd {
	
	public int getValueOfKthNodeFromEnd(Node head, int value) {
		if(head == null) {
			return -1;
		}
		Node fast = head; 
		Node slow = head;
		for(int i=0; i<= value; i++ ) {
			fast = fast.next;
		}
		while(fast.next !=null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.data;
	}

}
