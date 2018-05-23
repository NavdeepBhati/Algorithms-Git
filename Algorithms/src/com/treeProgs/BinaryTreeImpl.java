package com.treeProgs;

class Node {

	int data;
	Node right;
	Node left;

	public Node(int data) {
		this.data = data;
	}
}


public class BinaryTreeImpl {

	Node root;
	
	public static void main(String[] args) {
		
		BinaryTreeImpl tree= new BinaryTreeImpl();
		
		tree.root=new Node(1);

		tree.root.left= new Node(2);
		tree.root.right= new Node(3);
		

		tree.root.left.left= new Node(4);
		tree.root.left.right= new Node(5);

		
		tree.root.right.left= new Node(6);
		tree.root.right.right= new Node(7);
	
	printTree(tree.root);
	}

	private static void printTree(Node root2) {

		if (root2!=null) {
			System.out.println(root2.data);
			printTree(root2.left);
			printTree(root2.right);
			
		}
		
	}
	
}
