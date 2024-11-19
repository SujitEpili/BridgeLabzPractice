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
	
	void addFirst(T data)
	{
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		System.out.println(data + " added to Linked List at first position");
	}
	
	void addLast(T data)
	{
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		Node newNode = new Node();
		newNode.data = data;
		temp.next = newNode;
		System.out.println(data + " added to Linked List at last position");
	}
	
	void removeFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty !!!");
			return;
		}
		T data = head.data;
		head = head.next;
		System.out.println(data + " removed from 1st position");
	}
	
	void removeLast()
	{
		if(head == null)
		{
			System.out.println("List is empty !!!");
			return;
		}else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			removeAtPosition(size());
		}
	}
	
	void addAtPosition(int pos, T data)
	{
		int listSize = size();
		if(pos > (listSize+1))
		{
			System.out.println("The size of linked list is " + size() +
					" you can add at position upto " + (listSize+1));
		}else
		{
			Node temp = head;
			for(int i=1;i<pos-1;i++)
			{
				temp = temp.next;
			}
			Node newNode = new Node();
			newNode.data = data;
			newNode.next = temp.next;
			temp.next = newNode;
			System.out.println(data + " added to Linked List at " + pos + " position");
		}
	}
	
	void removeAtPosition(int pos)
	{
		if(head == null)
		{
			System.out.println("List is empty !!!");
			return;
		}
		int listSize = size();
		if(pos > (listSize+1))
		{
			System.out.println("The size of linked list is " + size() +
					" you can remove from position upto " + listSize);
		}else
		{
			Node temp = head;
			for(int i=1;i<pos-1;i++)
			{
				temp = temp.next;
			}
			System.out.println(temp.next.data + " removed from position " + pos);
			Node next = temp.next.next;
			temp.next = next;
		}
	}
	
	int size()
	{
		int listSize = 0;
		Node temp = head;
		while(temp !=null)
		{
			listSize++;
			temp = temp.next;
		}
		return listSize;
	}
	
	void print()
	{
		if(head == null)
		{
			System.out.println("List is empty !!!");
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
		list.addFirst(23);
		list.addLast(64);
		list.addAtPosition(14, 97);
		list.addAtPosition(4, 97);
		list.print();
		list.removeAtPosition(3);
		list.print();
		list.removeFirst();
		list.print();
		list.removeLast();
		list.print();
		System.out.println("Size : " + list.size());
		
//		LinkedList<String> ll = new LinkedList<>();
//		ll.add("abd");
//		ll.add("bss");
//		ll.add("cfs");
//		ll.add("dks");
//		ll.add("efr");
//		ll.print();
	}
}

