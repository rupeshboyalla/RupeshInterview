package LinkedList;
/**
 * 
 * https://www.youtube.com/watch?v=jiLloHVmLDc 
 * @author mouni
 *
 */
public class SwappingNode_Mysolution {
	
	public Node swapNodesInPairs(Node head) {
		if(head == null || head.next == null ) {
			return head;
		}
		Node current = head;
		Node newHead = current.next;
		while(true) {
			Node dummy = current.next;
			Node temp = dummy.next;
			dummy.next = current;
			if(temp == null || temp.next == null) {
				current.next = temp;
				break;
			}
			current.next = temp.next;
			current = temp;
		}
		return newHead;
	}
}

