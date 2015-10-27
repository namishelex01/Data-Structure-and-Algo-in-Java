package exercise;

public class BSTMain {
	
	public void applybst(){
		BST bst = new BST();		
		bst.insert(100);
		bst.insert(50);
		bst.insert(25);
		bst.insert(12);
		bst.insert(13);
		bst.insert(14);
		bst.insert(15);
		bst.insert(16);
		bst.insert(17);
		bst.insert(18);
		bst.insert(19);
		bst.insert(20);
		System.out.println("INORDER : ");
		bst.inorder();
		System.out.println("\nPRE-ORDER : ");
		bst.preorder();
		System.out.println("\nPOST-ORDER : ");
		bst.postorder();		
		//System.out.println("\n");
		if (bst.search(20))
			System.out.println("\nFOUND!!");
		//System.out.println("\n");
		if(!bst.search(0))
			System.out.println("\nNot Present");
		System.out.println(bst.countNodes()+" nodes present.");
		System.out.println("\n");
	}

	public static void main(String[] args) {
		
		BSTMain binarysearchtree = new BSTMain();
		
		binarysearchtree.applybst();
		
	}

}
