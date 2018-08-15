package com.treeProgs;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", left=" + left + ", right=" + right + "]";
	}
	
	
}

class BinaryTree {
	Node root;

	BinaryTree(int key) {
		root = new Node(key);
	}

	BinaryTree() {
		root = null;
	}

	static void insert(Node temp, int key)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
      
        // Do level order traversal until we find
        // an empty place. 
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
      
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);
      
            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }
	

	private static void printTree(Node root2) {

		if (root2 != null) {

			System.out.println(root2.key);
			printTree(root2.left);
			printTree(root2.right);
		}

	}

	private static void printTreeInOrder(Node root2) {

		if (root2 != null) {
			printTreeInOrder(root2.left);
			System.out.println(root2.key);
			printTreeInOrder(root2.right);
		}

	}

	private static void printTreePostOrder(Node root2) {

		if (root2 != null) {
			printTreePostOrder(root2.left);
			printTreePostOrder(root2.right);
			System.out.println(root2.key);
			
			String s;
		}

	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();

		tree.root = new Node(1);
		
		insert(tree.root,2);
		insert(tree.root,3);
		insert(tree.root,4);
		insert(tree.root,5);
		insert(tree.root,6);
		insert(tree.root,7);

		printTree(tree.root); // preOrder
		System.out.println();
		printTreeInOrder(tree.root); // InOrder
		System.out.println();
		printTreePostOrder(tree.root); // PostOrder
	}


}
