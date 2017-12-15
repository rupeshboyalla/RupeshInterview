package LinkedList;

public class ReverseLinkedList {
	
	public Node reverseLinkedList(Node head) {
		if(head == null) {
			return head;
		}
		Node prev=null, next=null, current=head;
		while(current.next !=null) {
			next = current.next;
			current = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

}
