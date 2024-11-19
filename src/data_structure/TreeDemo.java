package data_structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode<T>
{
	T data;
	TreeNode<T> left;
	TreeNode<T> right;
}

class Tree<T extends Comparable<T>>// Binary Search Tree
{
	TreeNode<T> root;
	
	void insert(T data)
	{
		root = insertRec(root,data);
	}
	
	TreeNode<T> insertRec(TreeNode<T> root, T data) // Recursive method
	{
		if(root == null)
		{
			root = new TreeNode<>();
			root.data = data;
		}
		else if(data.compareTo(root.data) < 0)
		{
			root.left = insertRec(root.left, data);
		}else if(data.compareTo(root.data) > 0)
		{
			root.right = insertRec(root.right, data);
		}
		
		return root;
	}
	
	void delete(T data)
	{
		root = deleteRec(root, data);
	}
	
	TreeNode<T> deleteRec(TreeNode<T> root, T data)
	{
		if (root == null) return root;
		if(data.compareTo(root.data) < 0)
		{
			root.left = deleteRec(root.left, data);
		}else if(data.compareTo(root.data) > 0)
		{
			root.right = deleteRec(root.right, data);
		}else
		{
			 if (root.left == null)
			 {
				 return root.right;
			 }else if (root.right == null)
			 {
				 return root.left;
			 }
			 root.right = deleteRec(root.right, root.data);
		}
		return root;
	}
	
	boolean bfsSearch(T key)
	{
		if (root == null) {
            return false;
        }
		Queue<TreeNode<T>> queue = new LinkedList<>(); 
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode<T> currentNode = queue.poll();
			if (currentNode.data.compareTo(key) == 0) 
			{
                System.out.println(key + " found in the tree using BFS.");
                return true;
            }
			if (currentNode.left != null) 
			{
                queue.add(currentNode.left);
            }
            if (currentNode.right != null)
            {
                queue.add(currentNode.right);
            }
		}
		System.out.println(key + " not found in the tree.");
        return false;
	}
	
	boolean dfsSearch(T key)
	{
		if (root == null) 
		{
            return false;
        }
		Stack<TreeNode<T>> stack = new Stack<>();
		stack.push(root);
		 while (!stack.isEmpty()) 
		 {
			 TreeNode<T> currentNode = stack.pop();
			 if (currentNode.data.compareTo(key) == 0) 
			 {
	            System.out.println(key + " found in the tree using DFS.");
	            return true;
	         }
			 if (currentNode.right != null) 
			 {
	            stack.push(currentNode.right);
	         }
	         if (currentNode.left != null)
	         {
	            stack.push(currentNode.left);
	         }
		 }
		 System.out.println(key + " not found in the tree.");
		    return false;
	}
			
	void printInOrder()
	{
		inOrderRec(root);
		System.out.println();
//		preOrderRec(root);
	}
	
	void inOrderRec(TreeNode<T> root)
	{
		if(root != null)
		{
			inOrderRec(root.left);
			System.out.print(root.data + " ");
			inOrderRec(root.right);
		}
	}
	
	void preOrderRec(TreeNode<T> root)
	{
		if(root != null)
		{
			System.out.print(root.data + " ");
			preOrderRec(root.left);
			preOrderRec(root.right);
		}
	}
	
}

public class TreeDemo
{
	public static void main(String[] args)
	{
		Tree<Integer> tree = new Tree<>();
		tree.insert(8);
		tree.insert(7);
		tree.insert(12);
		tree.insert(15);
		tree.insert(2);
		tree.insert(5);
		tree.printInOrder();
		tree.delete(7);
		tree.printInOrder();
		tree.bfsSearch(5);
		tree.dfsSearch(2);
		
//		Tree<String> tree2 = new Tree<>();
//		tree2.insert("banana");
//		tree2.insert("apple");
//		tree2.insert("mango");
//		tree2.insert("cherry");
//		tree2.insert("peach");
//		tree2.insert("grape");
//		tree2.insert("kiwi");
//		tree2.insert("orange");
//		tree2.insert("lemon");
//		tree2.insert("lime");
//		
//		tree2.printInOrder();
	}

}
