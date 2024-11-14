package data_structure;

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
		
		
		Tree<String> tree2 = new Tree<>();
		tree2.insert("banana");
		tree2.insert("apple");
		tree2.insert("mango");
		tree2.insert("cherry");
		tree2.insert("peach");
		tree2.insert("grape");
		tree2.insert("kiwi");
		tree2.insert("orange");
		tree2.insert("lemon");
		tree2.insert("lime");
		
		tree2.printInOrder();
	}

}
