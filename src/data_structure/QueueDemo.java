package data_structure;

class Queue<T>
{
	Node<T> front;
	Node<T> rear;
	
	void add(T data)
	{
		if(front == null)
		{
			front = rear = new Node<>();
			front.data = rear.data = data;
		}else
		{
			Node<T> newNode = new Node<>();
			newNode.data = data;
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println(data +" added in your queue");
	}
	
	void remove()
	{
		if(front == null)
		{
			System.out.println("There are no elements present inside your queue to remove !!!");
		}else
		{
			System.out.println("Element " + front.data + " is removed");
			front = front.next;			
		}
	}
	
	void peek()
	{
		System.out.println("The front element in Queue is : " + front.data);
	}
	
	void size()
	{
		int count = 0;
		Node<T> temp = front;
		while(temp != null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("The size of queue is :  " + count);
	}
	
	void isEmpty()
	{
		if(front == null)
		{
			System.out.println("Queue is empty");
		}else
		{
			System.out.println("Queue is not empty");
		}
	}
	
	void print()
	{
		if(front == null)
		{
			System.out.println("Your queue is empty !!!");
		}else
		{
			Node<T> temp = front;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}

public class QueueDemo<T>
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue = new Queue<>();
		queue.add(6);
		queue.add(42);
		queue.size();
		queue.peek();
		queue.remove();
		queue.peek();
		queue.add(64);
		queue.add(23);
		queue.add(63);
		queue.size();
		queue.peek();
		queue.print();
	}

}
