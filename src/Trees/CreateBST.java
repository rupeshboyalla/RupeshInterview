package Trees;

public class CreateBST {
	Node root = null;
	
	public void insert(Node root, int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		if(data <= root.data) {
			insert(root.left, data);
		}else if(data >= root.data) {
			insert(root.right, data);
		}
		
	}
	

}
