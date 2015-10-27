package exercise;

public class BST {
	
	Node root;
	
	BST(){
		root = null;
	}

	public boolean isEmpty(){
		return root == null;
	}
	
	public void insert(int data){
		root = insert(root, data);
	}
	
	private Node insert(Node n, int data){
		if (n == null)
			n = new Node(data);
		else {
			if (data<=n.getData())
				n.setLeft(insert(n.getLeft(),data));		// Data <= Root Data
			else
				n.setRight(insert(n.getRight(),data));		// Data > Root Data
		}
		return n;	
	}
	
	public void delete(int data){
		if(isEmpty())
			System.out.println("Empty Tree");
		else if (search(data) == false)
			System.out.println(data+" not Present");
		else{
			root = delete(root,data);
			System.out.println("Deleted "+data);
		}
	}
	
	private Node delete(Node root, int k){
		Node p, p2, n;
		if(root.getData() == k){
			Node l,r;
			l = root.getLeft();
			r = root.getRight();
			if (l == null && r == null)
				return null;
			else if (l == null){
				p = r;
				return p;
			}
			else if (r == null){
				p = l;
				return p;
			}else{
			p2 = r;
			p = r;
			while(p.getLeft()!=null)
				p = p.getLeft();
			p.setLeft(l);
			return p2;
			}
		}
		if(k < root.getData()){
			n = delete(root.getLeft(),k);
			root.setLeft(n);
		} else {
			n = delete(root.getRight(),k);
			root.setRight(n);
		}
		return root;		
	}
	
	public int countNodes(){
		return countNodes(root);
	}
	
	private int countNodes(Node r){
		if(r == null)
			return 0;
		else {
			int l = 1;
			l += countNodes(r.getLeft());
			l += countNodes(r.getRight());
			return l;
		}
	}
	
	public boolean search(int val){
		return search(root,val);
	}
	
	private boolean search(Node r, int val){
		boolean found = false;
		while( (r!=null) && !found ){
			int rval = r.getData();
			if (val < rval)
				r = r.getLeft();
			else if (val > rval)
				r = r.getRight();
			else {
				found = true;
				break;
			}
			found = search(r,val);
		}
		return found;
	}
	
							public void inorder(){
								inorder(root);
							}
							
							private void inorder(Node r){
								if (r != null){
									inorder(r.getLeft());
									System.out.print(r.getData()+" ");		// Traverse LEFT -> DISPLAY ROOT -> Traverse RIGHT 
									inorder(r.getRight());
								}
							}
	
	public void preorder(){
		preorder(root);
	}
	
	private void preorder(Node r){
		if (r != null){
			System.out.print(r.getData()+" ");								// DISPLAY ROOT -> Traverse LEFT -> Traverse RIGHT
			preorder(r.getLeft());			
			preorder(r.getRight());
		}
	}
							public void postorder(){
								postorder(root);
							}
							
							private void postorder(Node r){
								if (r != null){
									postorder(r.getLeft());			
									postorder(r.getRight());
									System.out.print(r.getData()+" ");		// Traverse LEFT -> Traverse RIGHT -> DISPLAY ROOT 
								}
							}
}
