package CustomHashMap;

public class CustomHashMap {
	
	private int BUCKET_SIZE;
	private Node bucket[] = new Node[BUCKET_SIZE];
	
	public CustomHashMap() {
		BUCKET_SIZE = 16;
	}
	public CustomHashMap(int size) {
		this.BUCKET_SIZE = size;
	}
	
	public void put(String key, int value) {
		int hash = getHash(key);
		int index = index(hash);
		Node entry = new Node(key, value);
		if(bucket[index] == null) {
			bucket[index] = entry;
			return;
		}else {
			Node current = bucket[index];
			while(current.next != null) {
				if(current.getKey().equals(entry.getKey())) {
					current.setValue(entry.getValue());
					return;
				}
				current = current.next;
			}
			current.next = entry;
		}		
	}
	public int get(String key) {
		int hash = getHash(key);
		int index = index(hash);
		Node n = bucket[index];
		while(n!= null) {
			if(n.getKey().equals(key)) {
				return n.getValue();
			}else {
				n = n.next;
			}
		}
		return -1;
	}
	
	
	public int getHash(String key) {
		String s = "hello";
			
		return Math.abs(key.hashCode());
	}
	
	public int index(int hash) {
		return hash % BUCKET_SIZE;
	}
}
