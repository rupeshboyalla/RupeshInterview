package LinkedList;

public class SwappingNodesInPairs {
	
	
	public Node swapNodeInPairs(Node head) {
		Node dummy = new Node(0);
		dummy.next = head;
		Node curr = dummy;
		Node l1= null, l2= null;
		while(curr.next !=null && curr.next.next !=null) {
			l1= curr.next;
			l2= curr.next.next;
			l1.next = l2.next;
			l2.next = l1;
			curr.next =l2;
			curr =l1;
		}

		return dummy.next;
	}
	
	
}
