package data_structure;

class Node<T>
{
	T data;
	Node<T> next;
}

class LinkedList<T>
{
	Node<T> head;
	
	void add(T data)
	{
		if(head == null)
		{
			head = new Node<>();
			head.data = data;
		}else
		{
			Node<T> temp = head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			Node<T> newNode = new Node<>();
			newNode.data = data;
			temp.next = newNode;
		}
		System.out.println(data + " added to Linked List");
	}
	
	void print()
	{
		if(head == null)
		{
			System.out.println("Your linked list is empty !!!");
		}else
		{
			Node<T> temp = head;
			while(temp != null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(12);
		list.add(4);
		list.add(1);
		list.add(41);
		list.add(31);
		list.print();
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("abd");
		ll.add("bss");
		ll.add("cfs");
		ll.add("dks");
		ll.add("efr");
		ll.print();
	}
}

