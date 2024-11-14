package data_structure;

class Stack<T>
{
	Node<T> top;
	
	void push(T data)
	{
		if(top == null)
		{
			top = new Node<>();
			top.data = data;
		}else
		{
			Node<T> newNode = new Node<>();
			newNode.data = data;
			newNode.next = top;
			top = newNode;			
		}
		System.out.println(data + " pushed in your stack");
	}
	
	void pop()
	{
		if(top == null)
		{
			System.out.println("Your stack is empty !!!");
		}else
		{
			System.out.println("Element " + top.data + " is popped from your stack");
			top = top.next;
		}
	}
	
	void peek()
	{
		System.out.println("The top element in Stack is : " + top.data);
	}
	
	void size()
	{
		int count = 0;
		Node<T> temp = top;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("The size of stack is :  " + count);
	}
	
	void isEmpty()
	{
		if(top == null)
		{
			System.out.println("Stack is empty");
		}else
		{
			System.out.println("Stack is not empty");
		}
	}
	
	void print()
	{
		if(top == null)
		{
			System.out.println("Your stack is empty !!!");
		}else
		{
			System.out.print("The elements of stack are : ");
			Node<T> temp = top;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

public class StackDemo 
{
	public static void main(String[] args) 
	{
		Stack<Integer> stack = new Stack<>();
		stack.push(3);
		stack.push(12);
		stack.push(31);
		stack.pop();
		stack.peek();
		stack.isEmpty();
		stack.size();
		stack.push(53);
		stack.push(15);
		stack.peek();
		stack.print();
		stack.peek();
		stack.isEmpty();
		stack.size();
	}

}
