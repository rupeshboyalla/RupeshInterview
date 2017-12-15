package LinkedList;

public class DeletingNthNodeFromEnd {
	
	// Idea is to keep the two pointers initialize both of then to head and move the n-Kth node.
	
	public void deleteNthNode(Node head, int value) {
		if(head == null) {
			return;
		}
		Node fast = head;
		Node slow = head;
		for(int i=0; i<=value; i++) {
			fast = fast.next;
		}
		while(fast.next.next !=null){
			fast = fast.next;
			slow = slow.next;
		}
		slow = slow.next.next;
	}
	
	

}
