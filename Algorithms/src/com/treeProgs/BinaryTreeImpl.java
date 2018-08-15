package com.treeProgs;

class NodeTree {

	int data;
	NodeTree right;
	NodeTree left;

	public NodeTree(int data) {
		this.data = data;
	}
}


public class BinaryTreeImpl {

	NodeTree root;
	
	public static void main(String[] args) {
		
		BinaryTreeImpl tree= new BinaryTreeImpl();
		
		tree.root=new NodeTree(1);

		tree.root.left= new NodeTree(2);
		tree.root.right= new NodeTree(3);
		

		tree.root.left.left= new NodeTree(4);
		tree.root.left.right= new NodeTree(5);

		
		tree.root.right.left= new NodeTree(6);
		tree.root.right.right= new NodeTree(7);
	
	printTree(tree.root);
	}

	private static void printTree(NodeTree root2) {

		if (root2!=null) {
			System.out.println(root2.data);
			printTree(root2.left);
			printTree(root2.right);
			
		}
		
	}
	
}
