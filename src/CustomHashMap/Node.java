package CustomHashMap;

public class Node {
	
	private String key;
	private int value; 
	Node next; 
	
	public Node() {
		this.next = null;
	}
	public Node(String key, int value) {
		this.key = key;
		this.value = value; 
		this.next = null;
	}
	
	public String getKey() {
		return key;
	}
	
	public void setKey(String key) {
		this.key = key;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		return next;
	}
}
