package LinkedList;

public class SwapNodeInPairs {
	
	
	public Node swapNodes(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node dummy = new Node(0);
		dummy = head;
		Node current = dummy.next;
		while(current.next != null && current.next.next != null) {
			Node first = current.next;
			Node second = current.next.next;
			first.next = second.next;
			current.next = second; 
			current.next.next = first; 
			current = current.next.next;
		}
		return dummy.next;
	}

}
